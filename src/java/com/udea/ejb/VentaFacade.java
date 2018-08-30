/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.ejb;

import com.udea.entity.Venta;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hector.guerra
 */
@Stateless
public class VentaFacade extends AbstractFacade<Venta> implements VentaFacadeLocal {

    @PersistenceContext(unitName = "ConcesionarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VentaFacade() {
        super(Venta.class);
    }

    @Override
    public void createVenta(Venta venta) {
        em.persist(venta);
    }

    @Override
    public List<Venta> getVentas() {
        return null;
    }

    @Override
    public void updateVenta(Venta venta) {
        
        em.merge(venta);
    }

    @Override
    public void deleteVenta(Venta venta) {
        em.remove(venta);
    }
    
    
    
    
    
}
