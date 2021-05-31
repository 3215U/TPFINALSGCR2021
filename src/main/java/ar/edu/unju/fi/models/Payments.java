package ar.edu.unju.fi.models;

import java.time.LocalDate;

public class Payments {
	private int customerNumber;
	private Boolean checkNumber;
	private LocalDate paymentDate;
	
	/**
	 * 
	 */
	public Payments() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param customerNumber
	 * @param checkNumber
	 * @param paymentDate
	 */
	public Payments(int customerNumber, Boolean checkNumber, LocalDate paymentDate) {
		super();
		this.customerNumber = customerNumber;
		this.checkNumber = checkNumber;
		this.paymentDate = paymentDate;
	}

	/**
	 * @return the customerNumber
	 */
	public int getCustomerNumber() {
		return customerNumber;
	}

	/**
	 * @param customerNumber the customerNumber to set
	 */
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	/**
	 * @return the checkNumber
	 */
	public Boolean getCheckNumber() {
		return checkNumber;
	}

	/**
	 * @param checkNumber the checkNumber to set
	 */
	public void setCheckNumber(Boolean checkNumber) {
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

	@Override
	public String toString() {
		return "Payments [customerNumber=" + customerNumber + ", checkNumber=" + checkNumber + ", paymentDate="
				+ paymentDate + "]";
	}

	
}
