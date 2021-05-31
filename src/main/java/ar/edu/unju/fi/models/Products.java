package ar.edu.unju.fi.models;

public class Products {
	
	private int productCode;
	private String productoName;
	private String productoLine;
	private int Scale;
	private String productVendedor;
	private String productDescription;
	private int quantyInStock;
	private double buyPrice;
	private int MSRP;
	
	
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
	

}
