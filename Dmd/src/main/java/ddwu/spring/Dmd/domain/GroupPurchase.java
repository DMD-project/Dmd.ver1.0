package ddwu.spring.Dmd.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity

@Table(name="grouppurchase")
public class GroupPurchase implements Serializable{

	@Id
	@SequenceGenerator(
			name = "gp_seq_generator",
			sequenceName = "gp_seq",
			initialValue = 3000,
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "gp_seq_generator"
			)
	private int id;
	private int price;
	@Column(name="discountrate")
	private int discountRate;
	private String content;
	@Column(name="salesqty")
	private int salesQty;
	@Column(name="fromdate")
	private String fromDate;
	@Column(name="todate")
	private String toDate;
	@Column(name="prodimgurl")
	private String prodImgUrl;
	private String state;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getSalesQty() {
		return salesQty;
	}
	public void setSalesQty(int salesQty) {
		this.salesQty = salesQty;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public String getProdImgUrl() {
		return prodImgUrl;
	}
	public void setProdImgUrl(String prodImgUrl) {
		this.prodImgUrl = prodImgUrl;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public GroupPurchase(int id, String name, int price, int discountRate, String content, int salesQty, String fromDate, String toDate,
			String prodImgUrl, String state) {
		super();
		this.id = id;
		this.price = price;
		this.discountRate = discountRate;
		this.content = content;
		this.salesQty = salesQty;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.prodImgUrl = prodImgUrl;
		this.state = state;
		this.name = name;
	}
	public GroupPurchase() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "GroupPurchase [id=" + id + ", price=" + price + ", discountRate=" + discountRate + ", content="
				+ content + ", salesQty=" + salesQty + ", fromDate=" + fromDate + ", toDate=" + toDate + ", prodImgUrl="
				+ prodImgUrl + ", state=" + state + "]";
	}
	
	
	
	
	
	
}
