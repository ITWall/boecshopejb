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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author nguye
 */
@Entity
@Table(name = "bill")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bill.findAll", query = "SELECT b FROM Bill b")
    , @NamedQuery(name = "Bill.findById", query = "SELECT b FROM Bill b WHERE b.id = :id")
    , @NamedQuery(name = "Bill.findByAmount", query = "SELECT b FROM Bill b WHERE b.amount = :amount")
    , @NamedQuery(name = "Bill.findByPayDate", query = "SELECT b FROM Bill b WHERE b.payDate = :payDate")
    , @NamedQuery(name = "Bill.findByCreateDate", query = "SELECT b FROM Bill b WHERE b.createDate = :createDate")})
public class Bill implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Amount")
    private int amount;
    @Column(name = "PayDate")
    private Integer payDate;
    @Column(name = "CreateDate")
    private Integer createDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "billID")
    private List<Transferstatus> transferstatusList;
    @JoinColumn(name = "TransferMethodID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Transfermethod transferMethodID;
    @JoinColumn(name = "BillStatusID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Billstatus billStatusID;
    @JoinColumn(name = "PersonID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Person personID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "billID")
    private List<Cart> cartList;

    public Bill() {
    }

    public Bill(Integer id) {
        this.id = id;
    }

    public Bill(Integer id, int amount) {
        this.id = id;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Integer getPayDate() {
        return payDate;
    }

    public void setPayDate(Integer payDate) {
        this.payDate = payDate;
    }

    public Integer getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Integer createDate) {
        this.createDate = createDate;
    }

    @XmlTransient
    public List<Transferstatus> getTransferstatusList() {
        return transferstatusList;
    }

    public void setTransferstatusList(List<Transferstatus> transferstatusList) {
        this.transferstatusList = transferstatusList;
    }

    public Transfermethod getTransferMethodID() {
        return transferMethodID;
    }

    public void setTransferMethodID(Transfermethod transferMethodID) {
        this.transferMethodID = transferMethodID;
    }

    public Billstatus getBillStatusID() {
        return billStatusID;
    }

    public void setBillStatusID(Billstatus billStatusID) {
        this.billStatusID = billStatusID;
    }

    public Person getPersonID() {
        return personID;
    }

    public void setPersonID(Person personID) {
        this.personID = personID;
    }

    @XmlTransient
    public List<Cart> getCartList() {
        return cartList;
    }

    public void setCartList(List<Cart> cartList) {
        this.cartList = cartList;
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
        if (!(object instanceof Bill)) {
            return false;
        }
        Bill other = (Bill) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Bill[ id=" + id + " ]";
    }
    
}
