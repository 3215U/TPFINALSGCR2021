package ar.edu.unju.fi.models;

public class Productlines {
	private String ProducLine;//nose q variable va
	private String textDescription;
	private String htmlDescription;
	private  String image;//nose de imagen
	/**
	 * 
	 */
	public Productlines() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param producLine
	 * @param textDescription
	 * @param htmlDescription
	 * @param image
	 */
	public Productlines(String producLine, String textDescription, String htmlDescription, String image) {
		super();
		ProducLine = producLine;
		this.textDescription = textDescription;
		this.htmlDescription = htmlDescription;
		this.image = image;
	}
	/**
	 * @return the producLine
	 */
	public String getProducLine() {
		return ProducLine;
	}
	/**
	 * @param producLine the producLine to set
	 */
	public void setProducLine(String producLine) {
		ProducLine = producLine;
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
	public String getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Productlines [ProducLine=" + ProducLine + ", textDescription=" + textDescription + ", htmlDescription="
				+ htmlDescription + ", image=" + image + "]";
	}
	
	
	

}
