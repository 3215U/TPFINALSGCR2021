package ar.edu.unju.fi.models;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="PRODUCTLINES")
public class ProductLines {
	

	@Id
	@Column(name="prodL_id")
	private Long id; 
	
	@Column(name="prodL_productlinename")
	private String productLinesName;
	
	@Column(name="prodL_textdescription")
	private String textDescription;
	
	@Column(name="prodL_htmldescription")
	private String htmlDescription;
	
	@Column(name="prodL_image")
	private Blob image;
	
	
	
	/**
	 * 
	 */
	public ProductLines() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param productLinesName
	 * @param textDescription
	 * @param htmlDescription
	 * @param image
	 */
	public ProductLines(Long id, String productLinesName, String textDescription, String htmlDescription, Blob image) {
		super();
		this.id = id;
		this.productLinesName = productLinesName;
		this.textDescription = textDescription;
		this.htmlDescription = htmlDescription;
		this.image = image;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the productLinesName
	 */
	public String getProductLinesName() {
		return productLinesName;
	}
	/**
	 * @param productLinesName the productLinesName to set
	 */
	public void setProductLinesName(String productLinesName) {
		this.productLinesName = productLinesName;
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
		return "ProductLines [id=" + id + ", productLinesName=" + productLinesName + ", textDescription="
				+ textDescription + ", htmlDescription=" + htmlDescription + ", image=" + image + "]";
	}
	
	
	
}
