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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author nguye
 */
@Entity
@Table(name = "cartinf")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cartinf.findAll", query = "SELECT c FROM Cartinf c")
    , @NamedQuery(name = "Cartinf.findById", query = "SELECT c FROM Cartinf c WHERE c.id = :id")
    , @NamedQuery(name = "Cartinf.findByType", query = "SELECT c FROM Cartinf c WHERE c.type = :type")
    , @NamedQuery(name = "Cartinf.findByBank", query = "SELECT c FROM Cartinf c WHERE c.bank = :bank")})
public class Cartinf implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "Type")
    private String type;
    @Size(max = 255)
    @Column(name = "Bank")
    private String bank;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cartInfID")
    private List<Card> cardList;

    public Cartinf() {
    }

    public Cartinf(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    @XmlTransient
    public List<Card> getCardList() {
        return cardList;
    }

    public void setCardList(List<Card> cardList) {
        this.cardList = cardList;
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
        if (!(object instanceof Cartinf)) {
            return false;
        }
        Cartinf other = (Cartinf) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Cartinf[ id=" + id + " ]";
    }
    
}
