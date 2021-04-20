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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
    , @NamedQuery(name = "TsTransaccion.findByTsId", query = "SELECT t FROM TsTransaccion t WHERE t.tsTransaccionPK.tsId = :tsId")
    , @NamedQuery(name = "TsTransaccion.findByTsFecha", query = "SELECT t FROM TsTransaccion t WHERE t.tsFecha = :tsFecha")
    , @NamedQuery(name = "TsTransaccion.findByTsNumTarjeta", query = "SELECT t FROM TsTransaccion t WHERE t.tsNumTarjeta = :tsNumTarjeta")
    , @NamedQuery(name = "TsTransaccion.findByTsNombreTitula", query = "SELECT t FROM TsTransaccion t WHERE t.tsNombreTitula = :tsNombreTitula")
    , @NamedQuery(name = "TsTransaccion.findByTsMonto", query = "SELECT t FROM TsTransaccion t WHERE t.tsMonto = :tsMonto")
    , @NamedQuery(name = "TsTransaccion.findByMaFranquiciasFqId", query = "SELECT t FROM TsTransaccion t WHERE t.tsTransaccionPK.maFranquiciasFqId = :maFranquiciasFqId")})
public class TsTransaccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TsTransaccionPK tsTransaccionPK;
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
    @JoinColumn(name = "ma_franquicias_fq_id", referencedColumnName = "fq_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private MaFranquicias maFranquicias;

    public TsTransaccion() {
    }

    public TsTransaccion(TsTransaccionPK tsTransaccionPK) {
        this.tsTransaccionPK = tsTransaccionPK;
    }

    public TsTransaccion(TsTransaccionPK tsTransaccionPK, Date tsFecha) {
        this.tsTransaccionPK = tsTransaccionPK;
        this.tsFecha = tsFecha;
    }

    public TsTransaccion(int tsId, int maFranquiciasFqId) {
        this.tsTransaccionPK = new TsTransaccionPK(tsId, maFranquiciasFqId);
    }

    public TsTransaccionPK getTsTransaccionPK() {
        return tsTransaccionPK;
    }

    public void setTsTransaccionPK(TsTransaccionPK tsTransaccionPK) {
        this.tsTransaccionPK = tsTransaccionPK;
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

    public MaFranquicias getMaFranquicias() {
        return maFranquicias;
    }

    public void setMaFranquicias(MaFranquicias maFranquicias) {
        this.maFranquicias = maFranquicias;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tsTransaccionPK != null ? tsTransaccionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TsTransaccion)) {
            return false;
        }
        TsTransaccion other = (TsTransaccion) object;
        if ((this.tsTransaccionPK == null && other.tsTransaccionPK != null) || (this.tsTransaccionPK != null && !this.tsTransaccionPK.equals(other.tsTransaccionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.udea.entity.TsTransaccion[ tsTransaccionPK=" + tsTransaccionPK + " ]";
    }
    
}
