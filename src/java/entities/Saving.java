/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
 * @author Trung Nguyen
 */
@Entity
@Table(name = "saving")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Saving.findAll", query = "SELECT s FROM Saving s")
    , @NamedQuery(name = "Saving.findById", query = "SELECT s FROM Saving s WHERE s.id = :id")
    , @NamedQuery(name = "Saving.findByIdaccount", query = "SELECT s FROM Saving s WHERE s.idaccount = :idaccount")
    , @NamedQuery(name = "Saving.findByIdhusbandry", query = "SELECT s FROM Saving s WHERE s.idhusbandry = :idhusbandry")
    , @NamedQuery(name = "Saving.findByIdemployeeaccount", query = "SELECT s FROM Saving s WHERE s.idemployeeaccount = :idemployeeaccount")
    , @NamedQuery(name = "Saving.findByProvisionDate", query = "SELECT s FROM Saving s WHERE s.provisionDate = :provisionDate")
    , @NamedQuery(name = "Saving.findByExpriationDate", query = "SELECT s FROM Saving s WHERE s.expriationDate = :expriationDate")
    , @NamedQuery(name = "Saving.findByInterestTotal", query = "SELECT s FROM Saving s WHERE s.interestTotal = :interestTotal")
    , @NamedQuery(name = "Saving.findByDespositTotal", query = "SELECT s FROM Saving s WHERE s.despositTotal = :despositTotal")
    , @NamedQuery(name = "Saving.findByTerm", query = "SELECT s FROM Saving s WHERE s.term = :term")
    , @NamedQuery(name = "Saving.findByTypeofmoney", query = "SELECT s FROM Saving s WHERE s.typeofmoney = :typeofmoney")})
public class Saving implements Serializable {

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
    @Column(name = "idaccount")
    private String idaccount;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "idhusbandry")
    private String idhusbandry;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "idemployeeaccount")
    private String idemployeeaccount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "provisionDate")
    @Temporal(TemporalType.DATE)
    private Date provisionDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "expriationDate")
    @Temporal(TemporalType.DATE)
    private Date expriationDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "interestTotal")
    private float interestTotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "despositTotal")
    private float despositTotal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "term")
    private String term;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "typeofmoney")
    private String typeofmoney;

    public Saving() {
    }

    public Saving(String id) {
        this.id = id;
    }

    public Saving(String id, String idaccount, String idhusbandry, String idemployeeaccount, Date provisionDate, Date expriationDate, float interestTotal, float despositTotal, String term, String typeofmoney) {
        this.id = id;
        this.idaccount = idaccount;
        this.idhusbandry = idhusbandry;
        this.idemployeeaccount = idemployeeaccount;
        this.provisionDate = provisionDate;
        this.expriationDate = expriationDate;
        this.interestTotal = interestTotal;
        this.despositTotal = despositTotal;
        this.term = term;
        this.typeofmoney = typeofmoney;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdaccount() {
        return idaccount;
    }

    public void setIdaccount(String idaccount) {
        this.idaccount = idaccount;
    }

    public String getIdhusbandry() {
        return idhusbandry;
    }

    public void setIdhusbandry(String idhusbandry) {
        this.idhusbandry = idhusbandry;
    }

    public String getIdemployeeaccount() {
        return idemployeeaccount;
    }

    public void setIdemployeeaccount(String idemployeeaccount) {
        this.idemployeeaccount = idemployeeaccount;
    }

    public Date getProvisionDate() {
        return provisionDate;
    }

    public void setProvisionDate(Date provisionDate) {
        this.provisionDate = provisionDate;
    }

    public Date getExpriationDate() {
        return expriationDate;
    }

    public void setExpriationDate(Date expriationDate) {
        this.expriationDate = expriationDate;
    }

    public float getInterestTotal() {
        return interestTotal;
    }

    public void setInterestTotal(float interestTotal) {
        this.interestTotal = interestTotal;
    }

    public float getDespositTotal() {
        return despositTotal;
    }

    public void setDespositTotal(float despositTotal) {
        this.despositTotal = despositTotal;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getTypeofmoney() {
        return typeofmoney;
    }

    public void setTypeofmoney(String typeofmoney) {
        this.typeofmoney = typeofmoney;
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
        if (!(object instanceof Saving)) {
            return false;
        }
        Saving other = (Saving) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Saving[ id=" + id + " ]";
    }
    
}
