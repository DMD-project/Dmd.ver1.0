package ddwu.spring.Dmd.domain;

public class Cart {

	private String userID;
	private String prodID;
	private int qty;
	private String ispurchase; //("n" / "y")
	
	public Cart(String userID, String prodID, int qty, String ispurchase) {
		super();
		this.userID = userID;
		this.prodID = prodID;
		this.qty = qty;
		this.ispurchase = ispurchase;
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
	
	public String getIspurchase() {
		return ispurchase;
	}
	public void setIspurchase(String ispurchase) {
		this.ispurchase = ispurchase;
	}
	
	
	
}
