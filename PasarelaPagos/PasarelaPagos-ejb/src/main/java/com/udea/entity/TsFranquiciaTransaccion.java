/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.entity;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Esteban
 */
@Entity
@Table(name = "ts_franquicia_transaccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TsFranquiciaTransaccion.findAll", query = "SELECT t FROM TsFranquiciaTransaccion t")
    , @NamedQuery(name = "TsFranquiciaTransaccion.findByFtId", query = "SELECT t FROM TsFranquiciaTransaccion t WHERE t.ftId = :ftId")})
public class TsFranquiciaTransaccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ft_id")
    private Integer ftId;
    @JoinColumn(name = "id_franquicia", referencedColumnName = "fq_id")
    @ManyToOne(optional = false)
    private MaFranquicias idFranquicia;
    @JoinColumn(name = "id_transaccion", referencedColumnName = "ct_id")
    @ManyToOne(optional = false)
    private TsCliente idTransaccion;

    public TsFranquiciaTransaccion() {
    }

    public TsFranquiciaTransaccion(Integer ftId) {
        this.ftId = ftId;
    }

    public Integer getFtId() {
        return ftId;
    }

    public void setFtId(Integer ftId) {
        this.ftId = ftId;
    }

    public MaFranquicias getIdFranquicia() {
        return idFranquicia;
    }

    public void setIdFranquicia(MaFranquicias idFranquicia) {
        this.idFranquicia = idFranquicia;
    }

    public TsCliente getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(TsCliente idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ftId != null ? ftId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TsFranquiciaTransaccion)) {
            return false;
        }
        TsFranquiciaTransaccion other = (TsFranquiciaTransaccion) object;
        if ((this.ftId == null && other.ftId != null) || (this.ftId != null && !this.ftId.equals(other.ftId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.udea.entity.TsFranquiciaTransaccion[ ftId=" + ftId + " ]";
    }
    
}
