/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.pi.dao;

import com.br.pi.entities.Pedido;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

/**
 *
 * @author paulo.lima
 */
@Stateless
@LocalBean
public class PedidoDAO implements GenericDAO<Pedido> {
    
    @PersistenceContext(unitName = "interjndi", type = PersistenceContextType.TRANSACTION)
    private EntityManager em;
    
    @Override
    public void persist(Pedido e) {
        em.persist(e);
    }

    @Override
    public List<Pedido> read() {
        return em.createNamedQuery("Pedido.findAll", Pedido.class).getResultList();
    }

    @Override
    public void update(Pedido e) {
        em.merge(e);
    }

    @Override
    public void remove(Pedido e) {
        em.remove(e);
    }

    @Override
    public Pedido findById(long id) {
        return em.find(Pedido.class, id);
    }
    
    public Pedido findByDestinatario(String destinatario){
        return em.find(Pedido.class, destinatario);
    }
    
    public Pedido findByEndereco(String endereco){
        return em.find(Pedido.class, endereco);
    }
}
