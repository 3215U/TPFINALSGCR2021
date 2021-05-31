package ar.edu.unju.fi.models;

public class Products {
	
	private int productCode;
	private String productoName;
	private String productoLine;//nose a que se refiere 
	private int Scale;//pienso q es de nuemros
	private String productVendedor;
	private String productDescription;
	private int quantyInStock;
	private double buyPrice;
	private int MSRP;//nose q es 
	
	
	/**
	 * 
	 */
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param productCode
	 * @param productoName
	 * @param productoLine
	 * @param scale
	 * @param productVendedor
	 * @param productDescription
	 * @param quantyInStock
	 * @param buyPrice
	 * @param mSRP
	 */
	public Products(int productCode, String productoName, String productoLine, int scale, String productVendedor,
			String productDescription, int quantyInStock, double buyPrice, int mSRP) {
		super();
		this.productCode = productCode;
		this.productoName = productoName;
		this.productoLine = productoLine;
		Scale = scale;
		this.productVendedor = productVendedor;
		this.productDescription = productDescription;
		this.quantyInStock = quantyInStock;
		this.buyPrice = buyPrice;
		MSRP = mSRP;
	}


	/**
	 * @return the productCode
	 */
	public int getProductCode() {
		return productCode;
	}


	/**
	 * @param productCode the productCode to set
	 */
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}


	/**
	 * @return the productoName
	 */
	public String getProductoName() {
		return productoName;
	}


	/**
	 * @param productoName the productoName to set
	 */
	public void setProductoName(String productoName) {
		this.productoName = productoName;
	}


	/**
	 * @return the productoLine
	 */
	public String getProductoLine() {
		return productoLine;
	}


	/**
	 * @param productoLine the productoLine to set
	 */
	public void setProductoLine(String productoLine) {
		this.productoLine = productoLine;
	}


	/**
	 * @return the scale
	 */
	public int getScale() {
		return Scale;
	}


	/**
	 * @param scale the scale to set
	 */
	public void setScale(int scale) {
		Scale = scale;
	}


	/**
	 * @return the productVendedor
	 */
	public String getProductVendedor() {
		return productVendedor;
	}


	/**
	 * @param productVendedor the productVendedor to set
	 */
	public void setProductVendedor(String productVendedor) {
		this.productVendedor = productVendedor;
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
	 * @return the quantyInStock
	 */
	public int getQuantyInStock() {
		return quantyInStock;
	}


	/**
	 * @param quantyInStock the quantyInStock to set
	 */
	public void setQuantyInStock(int quantyInStock) {
		this.quantyInStock = quantyInStock;
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
	public int getMSRP() {
		return MSRP;
	}


	/**
	 * @param mSRP the mSRP to set
	 */
	public void setMSRP(int mSRP) {
		MSRP = mSRP;
	}


	@Override
	public String toString() {
		return "Products [productCode=" + productCode + ", productoName=" + productoName + ", productoLine="
				+ productoLine + ", Scale=" + Scale + ", productVendedor=" + productVendedor + ", productDescription="
				+ productDescription + ", quantyInStock=" + quantyInStock + ", buyPrice=" + buyPrice + ", MSRP=" + MSRP
				+ "]";
	}
	
	

}
