
package ar.edu.unju.fi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="PRODUCTS")
public class Products {
	

	@Id
	@Column(name = "produc_id")
	private Long productCode;//es varchar
	
	
	@Column(name = "produc_name")
	private String productName;
	
	@Column(name = "produc_line")
	private String productLine;
	
	@Column(name = "produc_scale")
	private String productScale;
	
	@Column(name = "produc_vendedor")
	private String productVendor;
	
	@Column(name = "produc_description")
	private String productDescription;//text
	
	@Column(name = "produc_quantityinStock")
	private int quantityInStock;//smallint
	
	@Column(name = "produc_buyprice")
	private double buyPrice;
	
	@Column(name = "produc_msrp")
	private double MSRP;
	
	@Autowired
	@OneToOne(mappedBy = "products")
	private OrderDetails orderDetails;

	@ManyToOne
	@Autowired
	@JoinColumn(name="prodL_id")
	private ProductLines productLines;

	
	/**
	 * 
	 */
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param productCode
	 * @param productName
	 * @param productLine
	 * @param productScale
	 * @param productVendor
	 * @param productDescription
	 * @param quantityInStock
	 * @param buyPrice
	 * @param mSRP
	 * @param productLines
	 */
	public Products(Long productCode, String productName, String productLine, String productScale, String productVendor,
			String productDescription, int quantityInStock, double buyPrice, double mSRP, ProductLines productLines) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.productLine = productLine;
		this.productScale = productScale;
		this.productVendor = productVendor;
		this.productDescription = productDescription;
		this.quantityInStock = quantityInStock;
		this.buyPrice = buyPrice;
		MSRP = mSRP;
		this.productLines = productLines;
	}
	/**
	 * @return the productCode
	 */
	public Long getProductCode() {
		return productCode;
	}
	/**
	 * @param productCode the productCode to set
	 */
	public void setProductCode(Long productCode) {
		this.productCode = productCode;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
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
	 * @return the productScale
	 */
	public String getProductScale() {
		return productScale;
	}
	/**
	 * @param productScale the productScale to set
	 */
	public void setProductScale(String productScale) {
		this.productScale = productScale;
	}
	/**
	 * @return the productVendor
	 */
	public String getProductVendor() {
		return productVendor;
	}
	/**
	 * @param productVendor the productVendor to set
	 */
	public void setProductVendor(String productVendor) {
		this.productVendor = productVendor;
	}
	/**
	 * @return the productDescription
	 */
	public String getProductDescription() {
		return productDescription;
	}
	/**
	 * @param productDescription the productDescription to set
	 */
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	/**
	 * @return the quantityInStock
	 */
	public int getQuantityInStock() {
		return quantityInStock;
	}
	/**
	 * @param quantityInStock the quantityInStock to set
	 */
	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
	/**
	 * @return the buyPrice
	 */
	public double getBuyPrice() {
		return buyPrice;
	}
	/**
	 * @param buyPrice the buyPrice to set
	 */
	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}
	/**
	 * @return the mSRP
	 */
	public double getMSRP() {
		return MSRP;
	}
	/**
	 * @param mSRP the mSRP to set
	 */
	public void setMSRP(double mSRP) {
		MSRP = mSRP;
	}
	/**
	 * @return the productLines
	 */
	public ProductLines getProductLines() {
		return productLines;
	}
	/**
	 * @param productLines the productLines to set
	 */
	public void setProductLines(ProductLines productLines) {
		this.productLines = productLines;
	}
	@Override
	public String toString() {
		return "Products [productCode=" + productCode + ", productName=" + productName + ", productLine=" + productLine
				+ ", productScale=" + productScale + ", productVendor=" + productVendor + ", productDescription="
				+ productDescription + ", quantityInStock=" + quantityInStock + ", buyPrice=" + buyPrice + ", MSRP="
				+ MSRP + ", productLines=" + productLines + "]";
	}
	

}
