package ddwu.spring.Dmd.service;

import java.util.List;

import ddwu.spring.Dmd.domain.Product;

public interface ProductFacade {
	
	//Product getProduct(String name);
	
	void addProduct(Product product);
	
	void updateProduct(Product product);
	
	List<Product> getProductListByCategory(String cateId);
	
	List<Product> searchProductList(String keywords);
	
	List<Product> getAllProducts();
	

}
