package ddwu.spring.Dmd.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Order implements Serializable {

  /* Private Fields */
  private int orderId;
  
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
  
  /* JavaBeans Properties */

  public int getOrderId() { return orderId; }
  public void setOrderId(int orderId) { this.orderId = orderId; }

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

  /* Public Methods */

  public void initOrder(Profile profile, Cart cart) {
    username = profile.getName();
    orderDate = new Date();

    addr = profile.getAddr();
    zipcode = profile.getZipcode();

    totalPrice = cart.getSubTotal();

    creditCard = "999 9999 9999 9999";
    expiryDate = "12/03";
    cardType = "Visa";
    locale = "CA";
    status = "P";

  }

}