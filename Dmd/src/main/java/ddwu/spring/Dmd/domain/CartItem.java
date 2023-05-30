package ddwu.spring.Dmd.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CartItem implements Serializable {
	private Item item;
	private String userID;
	private String prodID;
	private int qty;
	private boolean inStock;
	private String ispurchase; //("n" / "y")
	
	public CartItem(String userID, String prodID, int qty, String ispurchase) {
		super();
		this.userID = userID;
		this.prodID = prodID;
		this.qty = qty;
		this.ispurchase = ispurchase;
	}
	
	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	public String getProdID() {
		return prodID;
	}
	public void setProdID(String prodID) {
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
