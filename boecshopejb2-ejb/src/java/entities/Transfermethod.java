/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author nguye
 */
@Entity
@Table(name = "transfermethod")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transfermethod.findAll", query = "SELECT t FROM Transfermethod t")
    , @NamedQuery(name = "Transfermethod.findById", query = "SELECT t FROM Transfermethod t WHERE t.id = :id")
    , @NamedQuery(name = "Transfermethod.findByName", query = "SELECT t FROM Transfermethod t WHERE t.name = :name")
    , @NamedQuery(name = "Transfermethod.findByCost", query = "SELECT t FROM Transfermethod t WHERE t.cost = :cost")})
public class Transfermethod implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cost")
    private int cost;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "transferMethodID")
    private List<Bill> billList;

    public Transfermethod() {
    }

    public Transfermethod(Integer id) {
        this.id = id;
    }

    public Transfermethod(Integer id, int cost) {
        this.id = id;
        this.cost = cost;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @XmlTransient
    public List<Bill> getBillList() {
        return billList;
    }

    public void setBillList(List<Bill> billList) {
        this.billList = billList;
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
        if (!(object instanceof Transfermethod)) {
            return false;
        }
        Transfermethod other = (Transfermethod) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Transfermethod[ id=" + id + " ]";
    }
    
}
