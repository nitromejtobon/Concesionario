/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.ejb;

import com.udea.entity.Cliente;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author hector.guerra
 */
@Stateless
public class ClienteFacade extends AbstractFacade<Cliente> implements ClienteFacadeLocal {

    @PersistenceContext(unitName = "ConcesionarioPU")
    private EntityManager em;

    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    

    public ClienteFacade() {
        super(Cliente.class);
    }

    
    @Override
    public List<Cliente> getClientes() {
        Query query = em.createNamedQuery("Cliente.findAll");
        return query.getResultList();
    }

    @Override
    public void updateCliente(Cliente cliente) {
        em.merge(cliente);
    }

    @Override
    public void deleteCliente(Cliente cliente) {
        em.remove(cliente);
        
    }

    @Override
    public void createCliente(Cliente cliente) {
        em.persist(cliente);
        
    }
    
    
    
}
