/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tpi135.casosacad.EJB;

import com.tpi135.casosacad.TipoPaso;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Juank
 */
@Stateless
public class TipoPasoFacade extends AbstractFacade<TipoPaso> {

    @PersistenceContext(unitName = "com.tpi135_CasosAcad_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoPasoFacade() {
        super(TipoPaso.class);
    }
    
}
