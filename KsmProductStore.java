package ksmproduct;

public class KsmProductStore {
	private int ProductId;
	private String ProductName;
	private Double ProductPrice;
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	
	public KsmProductStore(int productId, String productName, Double productPrice) {
		super();
		ProductId = productId;
		ProductName = productName;
		ProductPrice = productPrice;
	}
	public Double getProductPrice() {
		return ProductPrice;
	}
	public void setProductPrice(double price) {
		ProductPrice = price;
	}
	public KsmProductStore() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
