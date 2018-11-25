/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author GIFS
 */
@Entity
@Table(name = "PAYMENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Payment.findAll", query = "SELECT p FROM Payment p")
    , @NamedQuery(name = "Payment.findByPaymentno", query = "SELECT p FROM Payment p WHERE p.paymentno = :paymentno")
    , @NamedQuery(name = "Payment.findByAmount", query = "SELECT p FROM Payment p WHERE p.amount = :amount")})
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PAYMENTNO")
    private Integer paymentno;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @JoinColumn(name = "ORDERNO", referencedColumnName = "ORDERNO")
    @OneToOne(optional = false)
    private Orders orderno;
    @JoinColumn(name = "SHIPNO", referencedColumnName = "SHIPNO")
    @OneToOne(optional = false)
    private Shipping shipno;
    @OneToOne(mappedBy = "paymentno")
    private Orders orders;
    @OneToOne(mappedBy = "paymentno")
    private Shipping shipping;

    public Payment() {
    }

    public Payment(Integer paymentno) {
        this.paymentno = paymentno;
    }

    public Integer getPaymentno() {
        return paymentno;
    }

    public void setPaymentno(Integer paymentno) {
        this.paymentno = paymentno;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Orders getOrderno() {
        return orderno;
    }

    public void setOrderno(Orders orderno) {
        this.orderno = orderno;
    }

    public Shipping getShipno() {
        return shipno;
    }

    public void setShipno(Shipping shipno) {
        this.shipno = shipno;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentno != null ? paymentno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Payment)) {
            return false;
        }
        Payment other = (Payment) object;
        if ((this.paymentno == null && other.paymentno != null) || (this.paymentno != null && !this.paymentno.equals(other.paymentno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "book.model.Payment[ paymentno=" + paymentno + " ]";
    }
    
}
