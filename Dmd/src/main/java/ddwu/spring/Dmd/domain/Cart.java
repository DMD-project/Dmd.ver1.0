package ddwu.spring.Dmd.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@IdClass(CartPK.class)
@Table(name="cart")
public class Cart implements Serializable {
	
	
//	@OneToMany
//    @JoinColumn(name = "id")
//	private Product product;
	
	@Id
	@Column(name="userid")
	private String userId;
	
	@Id
	@Column(name="prodid")
	private int prodId;
	
	
	private int qty;
	private String ispurchase; //("n" / "y")
	
//	public Product getProd() {
//		return product;
//	}
//
//	public void setProd(Product product) {
//		this.product = product;
//	}
	
	public String getUserID() {
		return userId;
	}
	public void setUserID(String userID) {
		this.userId = userID;
	}
	
	public int getProdID() {
		return prodId;
	}
	public void setProdID(int prodID) {
		this.prodId = prodID;
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
