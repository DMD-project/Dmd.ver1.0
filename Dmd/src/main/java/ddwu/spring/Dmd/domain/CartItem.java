package ddwu.spring.Dmd.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="cart")
public class CartItem implements Serializable {
	
	
	@Id
	@ManyToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
	private Product product;
	
	@Column(name="userid")
	private String userID;
	
	private int prodID;
	private int qty;
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
