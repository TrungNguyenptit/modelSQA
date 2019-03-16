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
@Table(name = "employeeaccount")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employeeaccount.findAll", query = "SELECT e FROM Employeeaccount e")
    , @NamedQuery(name = "Employeeaccount.findById", query = "SELECT e FROM Employeeaccount e WHERE e.id = :id")
    , @NamedQuery(name = "Employeeaccount.findByUserName", query = "SELECT e FROM Employeeaccount e WHERE e.userName = :userName")
    , @NamedQuery(name = "Employeeaccount.findByPassWord", query = "SELECT e FROM Employeeaccount e WHERE e.passWord = :passWord")
    , @NamedQuery(name = "Employeeaccount.findByProvisionDate", query = "SELECT e FROM Employeeaccount e WHERE e.provisionDate = :provisionDate")
    , @NamedQuery(name = "Employeeaccount.findByBranch", query = "SELECT e FROM Employeeaccount e WHERE e.branch = :branch")
    , @NamedQuery(name = "Employeeaccount.findBySurplus", query = "SELECT e FROM Employeeaccount e WHERE e.surplus = :surplus")})
public class Employeeaccount implements Serializable {

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
    @Column(name = "userName")
    private String userName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "passWord")
    private String passWord;
    @Basic(optional = false)
    @NotNull
    @Column(name = "provisionDate")
    @Temporal(TemporalType.DATE)
    private Date provisionDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "branch")
    private String branch;
    @Basic(optional = false)
    @NotNull
    @Column(name = "surplus")
    private float surplus;

    public Employeeaccount() {
    }

    public Employeeaccount(String id) {
        this.id = id;
    }

    public Employeeaccount(String id, String userName, String passWord, Date provisionDate, String branch, float surplus) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.provisionDate = provisionDate;
        this.branch = branch;
        this.surplus = surplus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Date getProvisionDate() {
        return provisionDate;
    }

    public void setProvisionDate(Date provisionDate) {
        this.provisionDate = provisionDate;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public float getSurplus() {
        return surplus;
    }

    public void setSurplus(float surplus) {
        this.surplus = surplus;
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
        if (!(object instanceof Employeeaccount)) {
            return false;
        }
        Employeeaccount other = (Employeeaccount) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Employeeaccount[ id=" + id + " ]";
    }
    
}
