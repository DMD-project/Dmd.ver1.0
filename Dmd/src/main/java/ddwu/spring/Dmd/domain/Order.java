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
@Table(name="ORDERPROD")
public class Order implements Serializable {

	@Id
//	@Column(name="ORDERID")
	@SequenceGenerator(
			name = "order_seq_generator",
			sequenceName = "order_seq",
			initialValue = 4000,
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "order_seq_generator"
			)
	private int id;
	private String userID;
	
	@Column(name="SELECTITEMNUM")
	private int selectItemNum;
	
	@Column(name="RECEIVERNAME")
	private String receiverName;
	
	@Column(name="ORDERDATE", nullable=true)
	private Date orderDate;
	private String addr;
	private int zipcode;
	private String phone;
	
	@Column(name="TOTALPRICE")
	private int totalPrice;
	
	@Column(name="PRODID")
  	private int prodID;
  
	@Column(name="CREDITCARD")
	private String creditCard;
	
	@Column(name="EXPIRYDATE")
	private String expiryDate;
	
	@Column(name="CARDTYPE")
  	private String cardType;
  	
  	public Order() {	
	  
  	}

  	public Order(int id, String userID, int selectItemNum, String receiverName, Date orderDate, String addr,
			int zipcode, String phone, int totalPrice, int prodID, String creditCard, String expiryDate,
			String cardType) {
		super();
		this.id = id;
		this.userID = userID;
		this.selectItemNum = selectItemNum;
		this.receiverName = receiverName;
		this.orderDate = orderDate;
		this.addr = addr;
		this.zipcode = zipcode;
		this.phone = phone;
		this.totalPrice = totalPrice;
		this.prodID = prodID;
		this.creditCard = creditCard;
		this.expiryDate = expiryDate;
		this.cardType = cardType;
	}

	public int getOrderId() { return id; }
  	public void setOrderId(int orderId) { this.id = id; }

  	public Date getOrderDate() { return orderDate; }
  	public void setOrderDate(Date orderDate) { this.orderDate = orderDate; }

  	public String getAddr() { return addr; }
  	public void setAddr(String addr) { this.addr = addr; }

  	public int getZipcode() { return zipcode; }
  	public void setZipcode(int zipcode) { this.zipcode = zipcode; }

  	public int getTotalPrice() { return totalPrice; }
  	public void setTotalPrice(int totalPrice) { this.totalPrice = totalPrice; }
  	
  	public String getCreditCard() { return creditCard; }
  	public void setCreditCard(String creditCard) { this.creditCard = creditCard; }

  	public String getExpiryDate() { return expiryDate; }
  	public void setExpiryDate(String expiryDate) { this.expiryDate = expiryDate; }

  	public String getCardType() { return cardType; }
  	public void setCardType(String cardType) { this.cardType = cardType; }
  	
  	public int getId() {return id;}
	public void setId(int id) {this.id = id;}

	public String getUserID() {return userID;}
	public void setUserID(String userID) {this.userID = userID;}

	public int getSelectItemNum() {return selectItemNum;}
	public void setSelectItemNum(int selectItemNum) {this.selectItemNum = selectItemNum;}

	public String getReceiverName() {return receiverName;}
	public void setReceiverName(String receiverName) {this.receiverName = receiverName;}

	public String getPhone() {return phone;}
	public void setPhone(String phone) {this.phone = phone;}

	public int getProdID() {return prodID;}
	public void setProdID(int prodID) {this.prodID = prodID;}

	public void initOrder(Profile profile, Cart cart) {
  		receiverName = profile.getName();
  		orderDate = new Date();

  		addr = profile.getAddr();
  		zipcode = profile.getZipcode();

//  		totalPrice = cart.getSubTotal();

  		creditCard = "999 9999 9999 9999";
  		expiryDate = "12/03";
    	cardType = "Visa";
  	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", userID=" + userID + ", selectItemNum=" + selectItemNum + ", receiverName="
				+ receiverName + ", orderDate=" + orderDate + ", addr=" + addr + ", zipcode=" + zipcode + ", phone="
				+ phone + ", totalPrice=" + totalPrice + ", prodID=" + prodID + ", creditCard=" + creditCard
				+ ", expiryDate=" + expiryDate + ", cardType=" + cardType + "]";
	}
  	
}
