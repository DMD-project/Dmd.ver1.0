package ddwu.spring.Dmd.domain;

import java.util.Date;

public class Order {

	private int orderId;
	private String userId;
	private Date orderDate;
	private String addr;
	private String zipcode;
	private double totalPrice;
	private String selectItemNum;
	private String paysystem;
	
	public Order(int orderId, String username, Date orderDate, String addr, String zipcode, double totlaPrice, String selectItemNum, String paysystem) {
		this.orderId = orderId;
		this.userId = userId;
		this.orderDate = orderDate;
		this.addr = addr;
		this.zipcode = zipcode;
		this.totalPrice = totalPrice;
		this.selectItemNum = selectItemNum;
		this.paysystem = paysystem;
		
	}
	
	public int getOrderId() {	return orderId; }
	public void setOrderId(int orderId) {	this.orderId = orderId; }
	
	public String getUserId() {	return userId; }
	public void setUserId(String username) {	this.userId = userId; }
	
	public Date getOrderDate() {	return orderDate; }
	public void setOrderDate(Date orderDate) {	this.orderDate = orderDate; }
	
	public String getAddr() {	return addr; }
	public void setAddr(String addr) {	this.addr = addr; }
	
	public String getZipcode() {	return zipcode; }
	public void setZipcode(String zipcode) {	this.zipcode = zipcode; }
	
	public Double getTotalPrice() {		return totalPrice; }
	public void setTotalPrice(Double totalPrice) {		this.totalPrice = totalPrice; }
	
	public String getSelectItemNum() {	return selectItemNum; }
	public void setSelectItemNum(String selectItemNum) {	this.selectItemNum = selectItemNum; }
	
	public String getPaysystem() {	return paysystem; }
	public void setPaysystem(String paysystem) {	this.paysystem = paysystem; }
	
	/*
	public void addOrder(Profile profile, Cart cart) {
	    username = profile.getUsername();
	    orderDate = new Date();

	}
	*/
	
}
