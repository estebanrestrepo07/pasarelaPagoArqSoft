/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.controller;

import com.udea.entity.MaFranquicias;
import com.udea.entity.TsCliente;
import com.udea.entity.TsTransaccion;
import com.udea.session.MaFranquiciasManagerLocal;
import com.udea.session.TsClienteManagerLocal;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Esteban
 */
public class TransactionMBean implements Serializable {

    @EJB
    private MaFranquiciasManagerLocal maFranquiciasManager;

    @EJB
    private TsClienteManagerLocal tsClienteManager;

    @EJB
    private com.udea.session.TsTransaccionManagerLocal tsTransaccionManager;
    
    // Propiedades del modelo
    
    private TsTransaccion tsTransaccion; //ingresar u obtener transaccion
    private TsCliente trCliente; // obtener el cliente o crearlo
    private List<MaFranquicias> maFranquicias; //obtener franquicias
    
    
    /**
     * Creates a new instance of TransactionMBean
     */
    public TransactionMBean() {
    }
    
}
