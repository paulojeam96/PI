/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.pi.projeto_interdisciplinar;

import com.br.pi.entities.Pedido;
import javax.ejb.Stateless;

/**
 *
 * @author paulo.lima
 */

@Stateless
public class PedidoManager {
    
    public static int calculaPreco(Pedido pedido){
        int preco = 5;
        
        if(pedido.getTipoDocumento().equals("Documento Confidencial")) preco = preco + 15;
        
        return preco;
    }
    
}
