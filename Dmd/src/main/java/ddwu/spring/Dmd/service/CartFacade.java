package ddwu.spring.Dmd.service;


import java.util.List;

import ddwu.spring.Dmd.domain.Cart;
import ddwu.spring.Dmd.domain.Product;

public interface CartFacade {
	void addCart(Cart cart);

	public Product removeProdById(int prodId);

	public void incrementQuantityByeProductId(int prodId);

	public void setQuantityByProdId(int prodId, int qty);

	public double getSubTotal();

	List<Cart> findAll();
	
	Cart getCart(int prodId) throws Exception;
	
	List<Cart> findByUserId(String userId);
}
