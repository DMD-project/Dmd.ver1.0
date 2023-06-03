package ddwu.spring.Dmd.controller;

import java.io.Serializable;

import ddwu.spring.Dmd.domain.Product;
import ddwu.spring.Dmd.domain.Profile;
@SuppressWarnings("serial")
public class ProductForm implements Serializable {
	
	private String id;
	private String cateId;
	private String name;
	private String brandId;
	private int price;
	private String content;
	private String prodImgUrl;
	
	private Product product;
	
	public ProductForm() {
		this.product = new Product();
	}
	public ProductForm(Product product) {
		this.product = product;
	}
	
	public Product getProduct() {
		return product;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCateId() {
		return cateId;
	}
	public void setCateId(String cateId) {
		this.cateId = cateId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
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
		return "ProductForm [id=" + id + ", cateId=" + cateId + ", name=" + name + ", brandId=" + brandId + ", price="
				+ price + ", content=" + content + ", prodImgUrl=" + prodImgUrl + "]";
	}
	
	

}
