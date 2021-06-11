package ar.edu.unju.fi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="OFFICES")
public class Offices {	
	
	@Column(name = "offic_officeCode")
	private int officeCode;
	
	@Column(name = "offic_city")
	private String city;
	
	@Column(name = "offic_phone")
	private int phone;
	
	@Column(name = "offic_addressLine1")
	private String addressLine1;
	
	@Column(name = "offic_addressLine2")
	private String addressLine2;
	
	@Column(name = "offic_state")
	private String state;//creo q es string
	
	@Column(name = "offic_country")
	private String country;
	
	@Column(name = "offic_postalCode")
	private String postalCode;
	
	@Column(name = "offic_territory")
	private String territory;
	/**
	 * 
	 */
	public Offices() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param officeCode
	 * @param city
	 * @param phone
	 * @param addressLine1
	 * @param addressLine2
	 * @param state
	 * @param country
	 * @param postalCode
	 * @param territory
	 */
	public Offices(int officeCode, String city, int phone, String addressLine1, String addressLine2, String state,
			String country, String postalCode, String territory) {
		super();
		this.officeCode = officeCode;
		this.city = city;
		this.phone = phone;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.state = state;
		this.country = country;
		this.postalCode = postalCode;
		this.territory = territory;
	}
	/**
	 * @return the officeCode
	 */
	public int getOfficeCode() {
		return officeCode;
	}
	/**
	 * @param officeCode the officeCode to set
	 */
	public void setOfficeCode(int officeCode) {
		this.officeCode = officeCode;
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
	 * @return the addressLine2
	 */
	public String getAddressLine2() {
		return addressLine2;
	}
	/**
	 * @param addressLine2 the addressLine2 to set
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
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
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
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
	 * @return the territory
	 */
	public String getTerritory() {
		return territory;
	}
	/**
	 * @param territory the territory to set
	 */
	public void setTerritory(String territory) {
		this.territory = territory;
	}
	@Override
	public String toString() {
		return "Offices [officeCode=" + officeCode + ", city=" + city + ", phone=" + phone + ", addressLine1="
				+ addressLine1 + ", addressLine2=" + addressLine2 + ", state=" + state + ", country=" + country
				+ ", postalCode=" + postalCode + ", territory=" + territory + "]";
	}
	
	
	
}
