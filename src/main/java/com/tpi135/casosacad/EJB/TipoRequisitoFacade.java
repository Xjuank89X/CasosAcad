/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tpi135.casosacad.EJB;

import com.tpi135.casosacad.TipoRequisito;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Juank
 */
@Stateless
@Named (value = "TipoRequisito")
public class TipoRequisitoFacade extends AbstractFacade<TipoRequisito> {

    @PersistenceContext(unitName = "com.tpi135_CasosAcad_war_1.0-SNAPSHOTPU")
    
    private EntityManager em; 
   @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    @Override
    public List<TipoRequisito> findAll() {
        return super.findAll();
    }
    
    public TipoRequisitoFacade() {
        super(TipoRequisito.class);
    }
    
}
