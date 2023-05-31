package ddwu.spring.Dmd.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="product")
public class Product implements Serializable {
	
	@Id
	private int id;
	private int cateID;
	private int brandID;
	
	private String name;
	private int price;
	private String content;
	private String prodIMGUrl;
	
	
	public Product() {}
	
	/* JavaBeans Properties */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getCateID() {
		return cateID;
	}
	public void setCateID(int cateID) {
		this.cateID = cateID;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBrandID() {
		return brandID;
	}
	public void setBrandID(int brandID) {
		this.brandID = brandID;
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
	
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", cateID=" + cateID + ", name=" + name + ", brandID=" + brandID + ", price="
				+ price + ", content=" + content + ", prodIMGUrl=" + prodIMGUrl + "]";
	}
	
}
