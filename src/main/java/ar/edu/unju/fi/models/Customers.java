package ar.edu.unju.fi.models;

public class Customers {

	private int customerNumber;
	private String customerName;
	private String contactLastName;
	private int phone;
	private String addressLine1;
	private String addresLine2;
	private String city;
	private String state;
	private String postalCode;
	private String coutry;
	private String salesRepEmployeeNumber;	
	private String creditLimit;
	/**
	 * 
	 */
	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param customerNumber
	 * @param customerName
	 * @param contactLastName
	 * @param phone
	 * @param addressLine1
	 * @param addresLine2
	 * @param city
	 * @param state
	 * @param postalCode
	 * @param coutry
	 * @param salesRepEmployeeNumber
	 * @param creditLimit
	 */
	public Customers(int customerNumber, String customerName, String contactLastName, int phone, String addressLine1,
			String addresLine2, String city, String state, String postalCode, String coutry,
			String salesRepEmployeeNumber, String creditLimit) {
		super();
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.contactLastName = contactLastName;
		this.phone = phone;
		this.addressLine1 = addressLine1;
		this.addresLine2 = addresLine2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.coutry = coutry;
		this.salesRepEmployeeNumber = salesRepEmployeeNumber;
		this.creditLimit = creditLimit;
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
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @return the contactLastName
	 */
	public String getContactLastName() {
		return contactLastName;
	}
	/**
	 * @param contactLastName the contactLastName to set
	 */
	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}
	/**
	 * @return the phone
	 */
	public int getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(int phone) {
		this.phone = phone;
	}
	/**
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}
	/**
	 * @param addressLine1 the addressLine1 to set
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	/**
	 * @return the addresLine2
	 */
	public String getAddresLine2() {
		return addresLine2;
	}
	/**
	 * @param addresLine2 the addresLine2 to set
	 */
	public void setAddresLine2(String addresLine2) {
		this.addresLine2 = addresLine2;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}
	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	/**
	 * @return the coutry
	 */
	public String getCoutry() {
		return coutry;
	}
	/**
	 * @param coutry the coutry to set
	 */
	public void setCoutry(String coutry) {
		this.coutry = coutry;
	}
	/**
	 * @return the salesRepEmployeeNumber
	 */
	public String getSalesRepEmployeeNumber() {
		return salesRepEmployeeNumber;
	}
	/**
	 * @param salesRepEmployeeNumber the salesRepEmployeeNumber to set
	 */
	public void setSalesRepEmployeeNumber(String salesRepEmployeeNumber) {
		this.salesRepEmployeeNumber = salesRepEmployeeNumber;
	}
	/**
	 * @return the creditLimit
	 */
	public String getCreditLimit() {
		return creditLimit;
	}
	/**
	 * @param creditLimit the creditLimit to set
	 */
	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}
	@Override
	public String toString() {
		return "Customers [customerNumber=" + customerNumber + ", customerName=" + customerName + ", contactLastName="
				+ contactLastName + ", phone=" + phone + ", addressLine1=" + addressLine1 + ", addresLine2="
				+ addresLine2 + ", city=" + city + ", state=" + state + ", postalCode=" + postalCode + ", coutry="
				+ coutry + ", salesRepEmployeeNumber=" + salesRepEmployeeNumber + ", creditLimit=" + creditLimit + "]";
	}
	
	
}
