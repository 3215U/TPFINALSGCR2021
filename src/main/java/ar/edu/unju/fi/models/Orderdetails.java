package ar.edu.unju.fi.models;

public class Orderdetails {

	private int orderNumber;
	private String producCode;
	private int qualityOrdered;
	private int priceEach;
	private int orderLineNumber;
	/**
	 * 
	 */
	public Orderdetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param orderNumber
	 * @param producCode
	 * @param qualityOrdered
	 * @param priceEach
	 * @param orderLineNumber
	 */
	public Orderdetails(int orderNumber, String producCode, int qualityOrdered, int priceEach, int orderLineNumber) {
		super();
		this.orderNumber = orderNumber;
		this.producCode = producCode;
		this.qualityOrdered = qualityOrdered;
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
	 * @return the producCode
	 */
	public String getProducCode() {
		return producCode;
	}
	/**
	 * @param producCode the producCode to set
	 */
	public void setProducCode(String producCode) {
		this.producCode = producCode;
	}
	/**
	 * @return the qualityOrdered
	 */
	public int getQualityOrdered() {
		return qualityOrdered;
	}
	/**
	 * @param qualityOrdered the qualityOrdered to set
	 */
	public void setQualityOrdered(int qualityOrdered) {
		this.qualityOrdered = qualityOrdered;
	}
	/**
	 * @return the priceEach
	 */
	public int getPriceEach() {
		return priceEach;
	}
	/**
	 * @param priceEach the priceEach to set
	 */
	public void setPriceEach(int priceEach) {
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
		return "Orderdetails [orderNumber=" + orderNumber + ", producCode=" + producCode + ", qualityOrdered="
				+ qualityOrdered + ", priceEach=" + priceEach + ", orderLineNumber=" + orderLineNumber + "]";
	}
	
	
}
