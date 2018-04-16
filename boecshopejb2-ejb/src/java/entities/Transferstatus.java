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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nguye
 */
@Entity
@Table(name = "transferstatus")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transferstatus.findAll", query = "SELECT t FROM Transferstatus t")
    , @NamedQuery(name = "Transferstatus.findById", query = "SELECT t FROM Transferstatus t WHERE t.id = :id")
    , @NamedQuery(name = "Transferstatus.findByStatus", query = "SELECT t FROM Transferstatus t WHERE t.status = :status")
    , @NamedQuery(name = "Transferstatus.findByTime", query = "SELECT t FROM Transferstatus t WHERE t.time = :time")})
public class Transferstatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "Status")
    private String status;
    @Column(name = "Time")
    private Integer time;
    @JoinColumn(name = "BillID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Bill billID;

    public Transferstatus() {
    }

    public Transferstatus(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Bill getBillID() {
        return billID;
    }

    public void setBillID(Bill billID) {
        this.billID = billID;
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
        if (!(object instanceof Transferstatus)) {
            return false;
        }
        Transferstatus other = (Transferstatus) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Transferstatus[ id=" + id + " ]";
    }
    
}
