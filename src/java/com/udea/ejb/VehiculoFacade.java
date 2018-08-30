/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.ejb;

import com.udea.entity.Vehiculo;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hector.guerra
 */
@Stateless
public class VehiculoFacade extends AbstractFacade<Vehiculo> implements VehiculoFacadeLocal {

    @PersistenceContext(unitName = "ConcesionarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VehiculoFacade() {
        super(Vehiculo.class);
    }

    @Override
    public void createVehiculo(Vehiculo vehiculo) {
        em.persist(vehiculo);
    }

    @Override
    public List<Vehiculo> getVehiculos() {
        return null;
    }

    @Override
    public void updateVehiculo(Vehiculo vehiculo) {
        em.merge(vehiculo);
    }

    @Override
    public void deleteVehiculo(Vehiculo vehiculo) {
        em.remove(vehiculo);
    }
    
    
    
}
