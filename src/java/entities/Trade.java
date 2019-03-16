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
@Table(name = "trade")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trade.findAll", query = "SELECT t FROM Trade t")
    , @NamedQuery(name = "Trade.findById", query = "SELECT t FROM Trade t WHERE t.id = :id")
    , @NamedQuery(name = "Trade.findByIdSaving", query = "SELECT t FROM Trade t WHERE t.idSaving = :idSaving")
    , @NamedQuery(name = "Trade.findByTradetype", query = "SELECT t FROM Trade t WHERE t.tradetype = :tradetype")
    , @NamedQuery(name = "Trade.findByDateofTrade", query = "SELECT t FROM Trade t WHERE t.dateofTrade = :dateofTrade")
    , @NamedQuery(name = "Trade.findByAmount", query = "SELECT t FROM Trade t WHERE t.amount = :amount")})
public class Trade implements Serializable {

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
    @Column(name = "idSaving")
    private String idSaving;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "tradetype")
    private String tradetype;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateofTrade")
    @Temporal(TemporalType.DATE)
    private Date dateofTrade;
    @Basic(optional = false)
    @NotNull
    @Column(name = "amount")
    private float amount;

    public Trade() {
    }

    public Trade(String id) {
        this.id = id;
    }

    public Trade(String id, String idSaving, String tradetype, Date dateofTrade, float amount) {
        this.id = id;
        this.idSaving = idSaving;
        this.tradetype = tradetype;
        this.dateofTrade = dateofTrade;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdSaving() {
        return idSaving;
    }

    public void setIdSaving(String idSaving) {
        this.idSaving = idSaving;
    }

    public String getTradetype() {
        return tradetype;
    }

    public void setTradetype(String tradetype) {
        this.tradetype = tradetype;
    }

    public Date getDateofTrade() {
        return dateofTrade;
    }

    public void setDateofTrade(Date dateofTrade) {
        this.dateofTrade = dateofTrade;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
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
        if (!(object instanceof Trade)) {
            return false;
        }
        Trade other = (Trade) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Trade[ id=" + id + " ]";
    }
    
}
