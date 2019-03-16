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
@Table(name = "husbandry")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Husbandry.findAll", query = "SELECT h FROM Husbandry h")
    , @NamedQuery(name = "Husbandry.findById", query = "SELECT h FROM Husbandry h WHERE h.id = :id")
    , @NamedQuery(name = "Husbandry.findByName", query = "SELECT h FROM Husbandry h WHERE h.name = :name")
    , @NamedQuery(name = "Husbandry.findByTerm", query = "SELECT h FROM Husbandry h WHERE h.term = :term")
    , @NamedQuery(name = "Husbandry.findByMinimumamountdespositcycle", query = "SELECT h FROM Husbandry h WHERE h.minimumamountdespositcycle = :minimumamountdespositcycle")
    , @NamedQuery(name = "Husbandry.findByTypeofmoney", query = "SELECT h FROM Husbandry h WHERE h.typeofmoney = :typeofmoney")
    , @NamedQuery(name = "Husbandry.findByDespositCycle", query = "SELECT h FROM Husbandry h WHERE h.despositCycle = :despositCycle")
    , @NamedQuery(name = "Husbandry.findByInterestPaymentCycle", query = "SELECT h FROM Husbandry h WHERE h.interestPaymentCycle = :interestPaymentCycle")
    , @NamedQuery(name = "Husbandry.findBySourcesofinterestPayment", query = "SELECT h FROM Husbandry h WHERE h.sourcesofinterestPayment = :sourcesofinterestPayment")
    , @NamedQuery(name = "Husbandry.findByNote", query = "SELECT h FROM Husbandry h WHERE h.note = :note")})
public class Husbandry implements Serializable {

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
    @Column(name = "term")
    private String term;
    @Basic(optional = false)
    @NotNull
    @Column(name = "minimumamountdespositcycle")
    private float minimumamountdespositcycle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "typeofmoney")
    private String typeofmoney;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "despositCycle")
    private String despositCycle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "interestPaymentCycle")
    private String interestPaymentCycle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "sourcesofinterestPayment")
    private String sourcesofinterestPayment;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "note")
    private String note;

    public Husbandry() {
    }

    public Husbandry(String id) {
        this.id = id;
    }

    public Husbandry(String id, String name, String term, float minimumamountdespositcycle, String typeofmoney, String despositCycle, String interestPaymentCycle, String sourcesofinterestPayment, String note) {
        this.id = id;
        this.name = name;
        this.term = term;
        this.minimumamountdespositcycle = minimumamountdespositcycle;
        this.typeofmoney = typeofmoney;
        this.despositCycle = despositCycle;
        this.interestPaymentCycle = interestPaymentCycle;
        this.sourcesofinterestPayment = sourcesofinterestPayment;
        this.note = note;
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

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public float getMinimumamountdespositcycle() {
        return minimumamountdespositcycle;
    }

    public void setMinimumamountdespositcycle(float minimumamountdespositcycle) {
        this.minimumamountdespositcycle = minimumamountdespositcycle;
    }

    public String getTypeofmoney() {
        return typeofmoney;
    }

    public void setTypeofmoney(String typeofmoney) {
        this.typeofmoney = typeofmoney;
    }

    public String getDespositCycle() {
        return despositCycle;
    }

    public void setDespositCycle(String despositCycle) {
        this.despositCycle = despositCycle;
    }

    public String getInterestPaymentCycle() {
        return interestPaymentCycle;
    }

    public void setInterestPaymentCycle(String interestPaymentCycle) {
        this.interestPaymentCycle = interestPaymentCycle;
    }

    public String getSourcesofinterestPayment() {
        return sourcesofinterestPayment;
    }

    public void setSourcesofinterestPayment(String sourcesofinterestPayment) {
        this.sourcesofinterestPayment = sourcesofinterestPayment;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
        if (!(object instanceof Husbandry)) {
            return false;
        }
        Husbandry other = (Husbandry) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Husbandry[ id=" + id + " ]";
    }
    
}
