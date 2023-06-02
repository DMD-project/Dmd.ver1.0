package ddwu.spring.Dmd.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CartItem implements Serializable {
	private Product prod;
	private String userID;
	private int prodID;
	private int qty;
	private boolean inStock;
	private String ispurchase; //("n" / "y")
	
	public CartItem(String userID, int prodID, int qty, String ispurchase) {
		super();
		this.userID = userID;
		this.prodID = prodID;
		this.qty = qty;
		this.ispurchase = ispurchase;
	}
	
	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	public int getProdID() {
		return prodID;
	}
	public void setProdID(int prodID) {
		this.prodID = prodID;
	}
	
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public boolean isInStock() {
		return inStock;
	}

	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}
	
	public String getIspurchase() {
		return ispurchase;
	}
	public void setIspurchase(String ispurchase) {
		this.ispurchase = ispurchase;
	}
	
	/* Public methods */

	public void incrementQuantity() {
		qty++;
	}
}
