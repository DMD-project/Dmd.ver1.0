package ddwu.spring.Dmd.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@SequenceGenerator(
		name = "sh_seq_generator",
		sequenceName = "sh_seq",
		initialValue = 2000,
		allocationSize = 1
		)
@Table(name="SECONDHAND")
public class SecondHand implements Serializable {
	
	@Id
	@Column(name="SECONDHANDID")
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "prod_seq_generator"
			)
	private int id;
	
	@Column(name="SHNAME")
	private String name;
	
	private int price;
	private String content;
	private String prodIMGUrl;
	private String buyerID;
	private String sellerID;
	
	@Column(name="WANTFLAG")
	private char wantFlag;
	
	@Column(name="SELLERFLAG")
	private char sellerFlag; //판매 상태 (판매중 / 판매완료)
	
	public SecondHand() {
		
	}
	
	public SecondHand(int id, String name, int price, String content, String prodIMGUrl, String buyerID,
			String sellerID, char wantFlag, char sellerFlag) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.content = content;
		this.prodIMGUrl = prodIMGUrl;
		this.buyerID = buyerID;
		this.sellerID = sellerID;
		this.wantFlag = wantFlag;
		this.sellerFlag = sellerFlag;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setSHName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getProdIMGUrl() {
		return prodIMGUrl;
	}

	public void setProdIMGUrl(String prodIMGUrl) {
		this.prodIMGUrl = prodIMGUrl;
	}

	public String getBuyerID() {
		return buyerID;
	}

	public void setBuyerID(String buyerID) {
		this.buyerID = buyerID;
	}

	public String getSellerID() {
		return sellerID;
	}

	public void setSellerID(String sellerID) {
		this.sellerID = sellerID;
	}

	public char getWantFlag() {
		return wantFlag;
	}

	public void setWantFlag(char wantFlag) {
		this.wantFlag = wantFlag;
	}

	public char getSellerFlag() {
		return sellerFlag;
	}

	public void setSellerFlag(char sellerFlag) {
		this.sellerFlag = sellerFlag;
	}

}
