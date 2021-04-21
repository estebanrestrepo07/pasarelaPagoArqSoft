/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.session;

import com.udea.entity.TsCliente;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author danyd
 */
@Stateless
public class TsClienteManager implements TsClienteManagerLocal {

    @PersistenceContext(unitName = "com.udea_PasarelaPagos-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;
    
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public TsCliente getClientebyId(String Id) {
        Query query = em.createNamedQuery("TsCliente.findByCtId");
        return (TsCliente) query.getSingleResult();
    }

    @Override
    public void createTsCliente(TsCliente tsCliente) {
        em.persist(tsCliente);
    }
    
    
    
    

   
    

    
    
    
}
