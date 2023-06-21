package ddwu.spring.Dmd.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CartItem implements Serializable {
	private Product product;
	private String userID;
	private int prodID;
	private int qty;
//	private boolean inStock;
	private String ispurchase; //("n" / "y")
	

	
	public Product getProd() {
		return product;
	}

	public void setProd(Product product) {
		this.product = product;
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
	
//	public double getTotalPrice() {
//		if (prod != null) {
//			return prod.getListPrice() * qty;
//		}
//		else {
//			return 0;
//		}
//	}
//	
//	public boolean isInStock() {
//		return inStock;
//	}
//
//	public void setInStock(boolean inStock) {
//		this.inStock = inStock;
//	}
	
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
