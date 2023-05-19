package ddwu.spring.Dmd.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Product implements Serializable {
	
	private String id;
	private String cateID;
	private String name;
	private String brandID;
	private int price;
	private int qty; // DB 필드 추가 필요
	private String content;
	private String prodIMGUrl;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getCateID() {
		return cateID;
	}
	public void setCateID(String cateID) {
		this.cateID = cateID;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBrandID() {
		return brandID;
	}
	public void setBrandID(String brandID) {
		this.brandID = brandID;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
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
	
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", cateID=" + cateID + ", name=" + name + ", brandID=" + brandID + ", price="
				+ price + ", qty=" + qty + ", content=" + content + ", prodIMGUrl=" + prodIMGUrl + "]";
	}
	
}
