package ksmproduct;

public class KsmOrderItemStore {
	private int orderid;
	private int productid;
	private int quantity;

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public KsmOrderItemStore(int orderid, int productid, int quantity) {
		super();
		this.orderid = orderid;
		this.productid = productid;
		this.quantity = quantity;
	}

	public KsmOrderItemStore() {
		super();
		// TODO Auto-generated constructor stub
	}

}
