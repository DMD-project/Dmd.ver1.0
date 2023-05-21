package ddwu.spring.Dmd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ddwu.spring.Dmd.dao.CategoryDao;
import ddwu.spring.Dmd.dao.ProductDAO;
import ddwu.spring.Dmd.domain.Category;

public class ProductService {

	@Autowired
	private ProductDAO product;
	@Autowired
	private CategoryDao category;
	
	public List<ProductDAO> getAllProduct() {
		return product.getAllProduct();
	}
	
	public List<ProductDAO> getByName(String searchName) {
		return product.getByName(searchName);
	}
	
	public ProductDAO getProduct(String prodId) {
		return product.getProduct(prodId);
	}
	
	public List<ProductDAO> rangeByPrice(int price) {
		return product.rangeByPrice(price);
	}
	
	public Category getCategory(int cateCode) {
		return category.getCategory(cateCode);
	}
	
}
