package ar.edu.unju.fi.models;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="PRODUCTLINES")
public class Productlines {
	
	
	@OneToMany
	@Column(name="productlines_productline")
	private String productLine;
	
	@Column(name="productlines_textdescription")
	private String textDescription;
	
	@Column(name="productlines_htmldescription")
	private String htmlDescription;
	
	@Column(name="productlines_image")
	private Blob image;
	/**
	 * 
	 */
	public Productlines() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param productLine
	 * @param textDescription
	 * @param htmlDescription
	 * @param image
	 */
	public Productlines(String productLine, String textDescription, String htmlDescription, Blob image) {
		super();
		this.productLine = productLine;
		this.textDescription = textDescription;
		this.htmlDescription = htmlDescription;
		this.image = image;
	}
	/**
	 * @return the productLine
	 */
	public String getProductLine() {
		return productLine;
	}
	/**
	 * @param productLine the productLine to set
	 */
	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}
	/**
	 * @return the textDescription
	 */
	public String getTextDescription() {
		return textDescription;
	}
	/**
	 * @param textDescription the textDescription to set
	 */
	public void setTextDescription(String textDescription) {
		this.textDescription = textDescription;
	}
	/**
	 * @return the htmlDescription
	 */
	public String getHtmlDescription() {
		return htmlDescription;
	}
	/**
	 * @param htmlDescription the htmlDescription to set
	 */
	public void setHtmlDescription(String htmlDescription) {
		this.htmlDescription = htmlDescription;
	}
	/**
	 * @return the image
	 */
	public Blob getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(Blob image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Productlines [productLine=" + productLine + ", textDescription=" + textDescription
				+ ", htmlDescription=" + htmlDescription + ", image=" + image + "]";
	}

	
}