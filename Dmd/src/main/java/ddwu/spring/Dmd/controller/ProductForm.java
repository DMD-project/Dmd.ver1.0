package ddwu.spring.Dmd.controller;

import java.io.Serializable;

import ddwu.spring.Dmd.domain.Product;
import ddwu.spring.Dmd.domain.Profile;
@SuppressWarnings("serial")
public class ProductForm implements Serializable {
	
	private int id;
	private int cateID;
	private String name;
	private int brandID;
	private int price;
	private String content;
	private String prodImgUrl;
	
	private Product product;
	
	public ProductForm() {
		this.product = new Product(id, cateID, name, brandID, price, content);
	}
	public ProductForm(Product product) {
		this.product = product;
	}
	
	public Product getProduct() {
		return product;
	}
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
	public String getProdImgUrl() {
		return prodImgUrl;
	}
	public void setProdImgUrl(String prodImgUrl) {
		this.prodImgUrl = prodImgUrl;
	}
	
	@Override
	public String toString() {
		return "ProductForm [id=" + id + ", cateId=" + cateID + ", name=" + name + ", brandId=" + brandID + ", price="
				+ price + ", content=" + content + ", prodImgUrl=" + prodImgUrl + "]";
	}
	
	

}
