package ar.edu.unju.fi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="ORDERDETAILS")
public class Orderdetails {
	
	@Column(name = "Orderdetails_ordernumber")
	private int orderNumber;
	
	@Column(name = "Orderdetails_productcode")
	private String productCode;
	
	@Column(name = "Orderdetails_quantityOrdered")
	private int quantityOrdered;
	
	@Column(name = "Orderdetails_priceeach")
	private double priceEach;
	
	@Column(name = "Orderdetails_orderlinenumber")
	private int orderLineNumber;//smallint
	/**
	 * 
	 */
	public Orderdetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param orderNumber
	 * @param productCode
	 * @param quantityOrdered
	 * @param priceEach
	 * @param orderLineNumber
	 */
	public Orderdetails(int orderNumber, String productCode, int quantityOrdered, double priceEach,
			int orderLineNumber) {
		super();
		this.orderNumber = orderNumber;
		this.productCode = productCode;
		this.quantityOrdered = quantityOrdered;
		this.priceEach = priceEach;
		this.orderLineNumber = orderLineNumber;
	}
	/**
	 * @return the orderNumber
	 */
	public int getOrderNumber() {
		return orderNumber;
	}
	/**
	 * @param orderNumber the orderNumber to set
	 */
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	/**
	 * @return the productCode
	 */
	public String getProductCode() {
		return productCode;
	}
	/**
	 * @param productCode the productCode to set
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	/**
	 * @return the quantityOrdered
	 */
	public int getQuantityOrdered() {
		return quantityOrdered;
	}
	/**
	 * @param quantityOrdered the quantityOrdered to set
	 */
	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}
	/**
	 * @return the priceEach
	 */
	public double getPriceEach() {
		return priceEach;
	}
	/**
	 * @param priceEach the priceEach to set
	 */
	public void setPriceEach(double priceEach) {
		this.priceEach = priceEach;
	}
	/**
	 * @return the orderLineNumber
	 */
	public int getOrderLineNumber() {
		return orderLineNumber;
	}
	/**
	 * @param orderLineNumber the orderLineNumber to set
	 */
	public void setOrderLineNumber(int orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}
	@Override
	public String toString() {
		return "Orderdetails [orderNumber=" + orderNumber + ", productCode=" + productCode + ", quantityOrdered="
				+ quantityOrdered + ", priceEach=" + priceEach + ", orderLineNumber=" + orderLineNumber + "]";
	}
	
	
}
