/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Esteban
 */
@Entity
@Table(name = "ts_transaccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TsTransaccion.findAll", query = "SELECT t FROM TsTransaccion t")
    , @NamedQuery(name = "TsTransaccion.findByTsId", query = "SELECT t FROM TsTransaccion t WHERE t.tsId = :tsId")
    , @NamedQuery(name = "TsTransaccion.findByTsFecha", query = "SELECT t FROM TsTransaccion t WHERE t.tsFecha = :tsFecha")
    , @NamedQuery(name = "TsTransaccion.findByTsNumTarjeta", query = "SELECT t FROM TsTransaccion t WHERE t.tsNumTarjeta = :tsNumTarjeta")
    , @NamedQuery(name = "TsTransaccion.findByTsNombreTitula", query = "SELECT t FROM TsTransaccion t WHERE t.tsNombreTitula = :tsNombreTitula")
    , @NamedQuery(name = "TsTransaccion.findByTsMonto", query = "SELECT t FROM TsTransaccion t WHERE t.tsMonto = :tsMonto")})
public class TsTransaccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ts_id")
    private Integer tsId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ts_fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tsFecha;
    @Column(name = "ts_num_tarjeta")
    private BigInteger tsNumTarjeta;
    @Size(max = 50)
    @Column(name = "ts_nombre_titula")
    private String tsNombreTitula;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ts_monto")
    private Double tsMonto;
    @JoinColumn(name = "ts_cliente", referencedColumnName = "ct_id")
    @ManyToOne
    private TsCliente tsCliente;

    public TsTransaccion() {
    }

    public TsTransaccion(Integer tsId) {
        this.tsId = tsId;
    }

    public TsTransaccion(Integer tsId, Date tsFecha) {
        this.tsId = tsId;
        this.tsFecha = tsFecha;
    }

    public Integer getTsId() {
        return tsId;
    }

    public void setTsId(Integer tsId) {
        this.tsId = tsId;
    }

    public Date getTsFecha() {
        return tsFecha;
    }

    public void setTsFecha(Date tsFecha) {
        this.tsFecha = tsFecha;
    }

    public BigInteger getTsNumTarjeta() {
        return tsNumTarjeta;
    }

    public void setTsNumTarjeta(BigInteger tsNumTarjeta) {
        this.tsNumTarjeta = tsNumTarjeta;
    }

    public String getTsNombreTitula() {
        return tsNombreTitula;
    }

    public void setTsNombreTitula(String tsNombreTitula) {
        this.tsNombreTitula = tsNombreTitula;
    }

    public Double getTsMonto() {
        return tsMonto;
    }

    public void setTsMonto(Double tsMonto) {
        this.tsMonto = tsMonto;
    }

    public TsCliente getTsCliente() {
        return tsCliente;
    }

    public void setTsCliente(TsCliente tsCliente) {
        this.tsCliente = tsCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tsId != null ? tsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TsTransaccion)) {
            return false;
        }
        TsTransaccion other = (TsTransaccion) object;
        if ((this.tsId == null && other.tsId != null) || (this.tsId != null && !this.tsId.equals(other.tsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.udea.entity.TsTransaccion[ tsId=" + tsId + " ]";
    }
    
}
