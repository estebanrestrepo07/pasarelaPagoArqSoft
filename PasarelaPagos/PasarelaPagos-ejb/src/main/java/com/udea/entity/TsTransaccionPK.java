/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Esteban
 */
@Embeddable
public class TsTransaccionPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ts_id")
    private int tsId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ma_franquicias_fq_id")
    private int maFranquiciasFqId;

    public TsTransaccionPK() {
    }

    public TsTransaccionPK(int tsId, int maFranquiciasFqId) {
        this.tsId = tsId;
        this.maFranquiciasFqId = maFranquiciasFqId;
    }

    public int getTsId() {
        return tsId;
    }

    public void setTsId(int tsId) {
        this.tsId = tsId;
    }

    public int getMaFranquiciasFqId() {
        return maFranquiciasFqId;
    }

    public void setMaFranquiciasFqId(int maFranquiciasFqId) {
        this.maFranquiciasFqId = maFranquiciasFqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) tsId;
        hash += (int) maFranquiciasFqId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TsTransaccionPK)) {
            return false;
        }
        TsTransaccionPK other = (TsTransaccionPK) object;
        if (this.tsId != other.tsId) {
            return false;
        }
        if (this.maFranquiciasFqId != other.maFranquiciasFqId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.udea.entity.TsTransaccionPK[ tsId=" + tsId + ", maFranquiciasFqId=" + maFranquiciasFqId + " ]";
    }
    
}
