package ddwu.spring.Dmd.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ddwu.spring.Dmd.domain.Cart;
import ddwu.spring.Dmd.domain.Product;

@Repository
public interface CartDao extends CrudRepository<Cart, Integer> {
	// save, findById, count, delete

//	void addCart(Cart cart);

//	public Product removeProdById(int prodId);
//
//	public void incrementQuantityByeProductId(int prodId);
//
//	public void setQuantityByProdId(int prodId, int qty);

//	public double getSubTotal();

	List<Cart> findAll();
	
	List<Cart> findByUserId(String userId);
}
