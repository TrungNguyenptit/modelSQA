/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Trung Nguyen
 */
@Entity
@Table(name = "interestrate")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Interestrate.findAll", query = "SELECT i FROM Interestrate i")
    , @NamedQuery(name = "Interestrate.findById", query = "SELECT i FROM Interestrate i WHERE i.id = :id")
    , @NamedQuery(name = "Interestrate.findByName", query = "SELECT i FROM Interestrate i WHERE i.name = :name")
    , @NamedQuery(name = "Interestrate.findByType", query = "SELECT i FROM Interestrate i WHERE i.type = :type")
    , @NamedQuery(name = "Interestrate.findByTerm", query = "SELECT i FROM Interestrate i WHERE i.term = :term")
    , @NamedQuery(name = "Interestrate.findByVndinterestrate", query = "SELECT i FROM Interestrate i WHERE i.vndinterestrate = :vndinterestrate")
    , @NamedQuery(name = "Interestrate.findByUsdinterestrate", query = "SELECT i FROM Interestrate i WHERE i.usdinterestrate = :usdinterestrate")
    , @NamedQuery(name = "Interestrate.findByEurinterestrate", query = "SELECT i FROM Interestrate i WHERE i.eurinterestrate = :eurinterestrate")
    , @NamedQuery(name = "Interestrate.findByAudinterestrate", query = "SELECT i FROM Interestrate i WHERE i.audinterestrate = :audinterestrate")})
public class Interestrate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "term")
    private String term;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vndinterestrate")
    private float vndinterestrate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usdinterestrate")
    private float usdinterestrate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "eurinterestrate")
    private float eurinterestrate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "audinterestrate")
    private float audinterestrate;

    public Interestrate() {
    }

    public Interestrate(String id) {
        this.id = id;
    }

    public Interestrate(String id, String name, String type, String term, float vndinterestrate, float usdinterestrate, float eurinterestrate, float audinterestrate) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.term = term;
        this.vndinterestrate = vndinterestrate;
        this.usdinterestrate = usdinterestrate;
        this.eurinterestrate = eurinterestrate;
        this.audinterestrate = audinterestrate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public float getVndinterestrate() {
        return vndinterestrate;
    }

    public void setVndinterestrate(float vndinterestrate) {
        this.vndinterestrate = vndinterestrate;
    }

    public float getUsdinterestrate() {
        return usdinterestrate;
    }

    public void setUsdinterestrate(float usdinterestrate) {
        this.usdinterestrate = usdinterestrate;
    }

    public float getEurinterestrate() {
        return eurinterestrate;
    }

    public void setEurinterestrate(float eurinterestrate) {
        this.eurinterestrate = eurinterestrate;
    }

    public float getAudinterestrate() {
        return audinterestrate;
    }

    public void setAudinterestrate(float audinterestrate) {
        this.audinterestrate = audinterestrate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Interestrate)) {
            return false;
        }
        Interestrate other = (Interestrate) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Interestrate[ id=" + id + " ]";
    }
    
}
