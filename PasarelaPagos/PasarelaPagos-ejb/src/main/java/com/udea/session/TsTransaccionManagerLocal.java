/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.session;

import com.udea.entity.TsTransaccion;
import javax.ejb.Local;

/**
 *
 * @author danyd
 */
@Local
public interface TsTransaccionManagerLocal {

    TsTransaccion getTsTransaccion(int tsTransaccionId);

    void createTransaccion(TsTransaccion tsTransaccion);
    
}
