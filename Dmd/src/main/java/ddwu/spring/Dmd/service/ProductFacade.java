package ddwu.spring.Dmd.service;

import ddwu.spring.Dmd.domain.Product;

public interface ProductFacade {

	//shop
	void addProduct(Product product);
	   
	void updateProduct(Product product);
	   
	Product getProduct(int prodId);
	   
	public void deleteProduct(int prodId);
	
}
