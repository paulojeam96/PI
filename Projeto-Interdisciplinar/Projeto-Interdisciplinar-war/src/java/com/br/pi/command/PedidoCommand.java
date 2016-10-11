/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.pi.command;

import com.br.pi.dao.PedidoDAO;
import com.br.pi.entities.Pedido;
import com.br.pi.projeto_interdisciplinar.PedidoManager;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author paulo.lima
 */
public class PedidoCommand implements Command {
    
    
    private String returnPage = "cliente_pedido.jsp";
    private HttpServletRequest request;
    private HttpServletResponse response;    

    @Override
    public void init(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }

    @Override
    public void execute() {
        String tipoDocumento = request.getParameter("entrega");
        String destinatario = request.getParameter("destinatario");
        String remetente = request.getParameter("remetente");
        String endereco = request.getParameter("end");
        
        Pedido pedido = new Pedido(tipoDocumento, destinatario, remetente, endereco, 0, "");
        
        int preco = PedidoManager.calculaPreco(pedido);
        
        pedido.setEntregaRealizada("nao");
        pedido.setPreco(preco);
        
        PedidoDAO pDAO = new PedidoDAO();
        
        pDAO.persist(pedido);
        
        request.getSession().setAttribute("confirmacaopedido", pedido);
        
        RequestDispatcher rd = request.getRequestDispatcher("confirmacao_pedido.jsp");
        
        try {
            rd.forward(request, response);
        } catch (ServletException | IOException ex) {
            Logger.getLogger(PedidoCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getReturnPage() {
        return this.returnPage;
    }

    
    
}
