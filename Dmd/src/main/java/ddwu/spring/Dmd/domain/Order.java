package ddwu.spring.Dmd.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import java.util.ArrayList;

import ddwu.spring.Dmd.domain.Cart;

@SuppressWarnings("serial")
@Entity
@Table(name="ORDER")
public class Order implements Serializable {

	@Id
	@Column(name="ORDERID")
	@SequenceGenerator(
			name = "order_seq_generator",
			sequenceName = "order_seq",
			initialValue = 1000,
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "order_seq_generator"
			)
	private int id;
  
	private String username;
	private Date orderDate;
	private String addr;
	private int zipcode;
  
	private double totalPrice;
  
	private String creditCard;
	private String expiryDate;
  	private String cardType;
  	private String locale;
  	private String status;
  
  	public Order() {	
	  
  	}
  
  	public Order(int id, String username, Date orderDate, String addr, int zipcode, double totalPrice,
  			String creditCard, String expiryDate, String cardType, String locale, String staus) {
	  
  		this.id = id;
  		this.username = username;
  		this.orderDate = orderDate;
  		this.addr = addr;
  		this.zipcode = zipcode;
  		this.totalPrice = totalPrice;
	  
  		this.creditCard = creditCard;
  		this.expiryDate = expiryDate;
  		this.cardType = cardType;
  		this.locale = locale;
  		this.status = status;
  	}

  	public int getOrderId() { return id; }
  	public void setOrderId(int orderId) { this.id = id; }

  	public String getUsername() { return username; }
  	public void setUsername(String username) { this.username = username; }

  	public Date getOrderDate() { return orderDate; }
  	public void setOrderDate(Date orderDate) { this.orderDate = orderDate; }

  	public String getAddr() { return addr; }
  	public void setAddr(String addr) { this.addr = addr; }

  	public int getZipcode() { return zipcode; }
  	public void setZipcode(int zipcode) { this.zipcode = zipcode; }

  	public double getTotalPrice() { return totalPrice; }
  	public void setTotalPrice(double totalPrice) { this.totalPrice = totalPrice; }
  	
  	public String getCreditCard() { return creditCard; }
  	public void setCreditCard(String creditCard) { this.creditCard = creditCard; }

  	public String getExpiryDate() { return expiryDate; }
  	public void setExpiryDate(String expiryDate) { this.expiryDate = expiryDate; }

  	public String getCardType() { return cardType; }
  	public void setCardType(String cardType) { this.cardType = cardType; }

  	public String getLocale() { return locale; }
  	public void setLocale(String locale) { this.locale = locale; }

  	public String getStatus() { return status; }
  	public void setStatus(String status) { this.status = status; }

  	
  	public void initOrder(Profile profile, Cart cart) {
  		username = profile.getName();
  		orderDate = new Date();

  		addr = profile.getAddr();
  		zipcode = profile.getZipcode();

//  		totalPrice = cart.getSubTotal();

  		creditCard = "999 9999 9999 9999";
  		expiryDate = "12/03";
    	cardType = "Visa";
    	locale = "CA";
    	status = "P";

  	}
  	
  	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + username + ", orderDate=" + orderDate + ", address=" + addr 
				+ ", zipcode=" + zipcode + ", totalPrice=" + totalPrice + ", creditCard=" + creditCard + ", expiryDate=" + expiryDate
				+ ", cardType=" + cardType + ", locale=" + locale + ", status=" + status + "]";
	}
  

}
