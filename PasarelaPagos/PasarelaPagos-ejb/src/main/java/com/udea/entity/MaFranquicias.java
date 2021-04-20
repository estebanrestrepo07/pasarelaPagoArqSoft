/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Esteban
 */
@Entity
@Table(name = "ma_franquicias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MaFranquicias.findAll", query = "SELECT m FROM MaFranquicias m")
    , @NamedQuery(name = "MaFranquicias.findByFqId", query = "SELECT m FROM MaFranquicias m WHERE m.fqId = :fqId")
    , @NamedQuery(name = "MaFranquicias.findByFqNombre", query = "SELECT m FROM MaFranquicias m WHERE m.fqNombre = :fqNombre")
    , @NamedQuery(name = "MaFranquicias.findByFqRangoInf", query = "SELECT m FROM MaFranquicias m WHERE m.fqRangoInf = :fqRangoInf")
    , @NamedQuery(name = "MaFranquicias.findByFqRangoSu", query = "SELECT m FROM MaFranquicias m WHERE m.fqRangoSu = :fqRangoSu")})
public class MaFranquicias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "fq_id")
    private Integer fqId;
    @Size(max = 50)
    @Column(name = "fq_nombre")
    private String fqNombre;
    @Column(name = "fq_rango_inf")
    private BigInteger fqRangoInf;
    @Column(name = "fq_rango_su")
    private BigInteger fqRangoSu;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maFranquicias")
    private Collection<TsTransaccion> tsTransaccionCollection;

    public MaFranquicias() {
    }

    public MaFranquicias(Integer fqId) {
        this.fqId = fqId;
    }

    public Integer getFqId() {
        return fqId;
    }

    public void setFqId(Integer fqId) {
        this.fqId = fqId;
    }

    public String getFqNombre() {
        return fqNombre;
    }

    public void setFqNombre(String fqNombre) {
        this.fqNombre = fqNombre;
    }

    public BigInteger getFqRangoInf() {
        return fqRangoInf;
    }

    public void setFqRangoInf(BigInteger fqRangoInf) {
        this.fqRangoInf = fqRangoInf;
    }

    public BigInteger getFqRangoSu() {
        return fqRangoSu;
    }

    public void setFqRangoSu(BigInteger fqRangoSu) {
        this.fqRangoSu = fqRangoSu;
    }

    @XmlTransient
    public Collection<TsTransaccion> getTsTransaccionCollection() {
        return tsTransaccionCollection;
    }

    public void setTsTransaccionCollection(Collection<TsTransaccion> tsTransaccionCollection) {
        this.tsTransaccionCollection = tsTransaccionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fqId != null ? fqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MaFranquicias)) {
            return false;
        }
        MaFranquicias other = (MaFranquicias) object;
        if ((this.fqId == null && other.fqId != null) || (this.fqId != null && !this.fqId.equals(other.fqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.udea.entity.MaFranquicias[ fqId=" + fqId + " ]";
    }
    
}
