/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karuna;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author riyak
 */
@Stateless
public class SheduledocFacade extends AbstractFacade<Sheduledoc> {
    @PersistenceContext(unitName = "doctorsPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SheduledocFacade() {
        super(Sheduledoc.class);
    }
    
}
