package ar.edu.unju.fi.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="PAYMENTS")
public class Payments {
	@Id
	@Column(name="pay_checknumber")//varchar clave principal
	private Long checkNumber;
	
	@Column(name="pay_paymentdate")
	private LocalDate paymentDate;
	
	@Column(name="pay_amount")
	private double amount;
	
	@Autowired
	@OneToOne
	@JoinColumn(name="cust_numero")
	private Customers customers;
	/**
	 * 
	 */
	public Payments() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param checkNumber
	 * @param paymentDate
	 * @param amount
	 * @param customers
	 */
	public Payments(Long checkNumber, LocalDate paymentDate, double amount, Customers customers) {
		super();
		this.checkNumber = checkNumber;
		this.paymentDate = paymentDate;
		this.amount = amount;
		this.customers = customers;
	}
	/**
	 * @return the checkNumber
	 */
	public Long getCheckNumber() {
		return checkNumber;
	}
	/**
	 * @param checkNumber the checkNumber to set
	 */
	public void setCheckNumber(Long checkNumber) {
		this.checkNumber = checkNumber;
	}
	/**
	 * @return the paymentDate
	 */
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	/**
	 * @param paymentDate the paymentDate to set
	 */
	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	/**
	 * @return the customers
	 */
	public Customers getCustomers() {
		return customers;
	}
	/**
	 * @param customers the customers to set
	 */
	public void setCustomers(Customers customers) {
		this.customers = customers;
	}
	@Override
	public String toString() {
		return "Payments [checkNumber=" + checkNumber + ", paymentDate=" + paymentDate + ", amount=" + amount
				+ ", customers=" + customers + "]";
	}
	
}
