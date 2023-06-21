package ddwu.spring.Dmd.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ddwu.spring.Dmd.dao.CartDao;
import ddwu.spring.Dmd.dao.ProductDao;
import ddwu.spring.Dmd.domain.Cart;
import ddwu.spring.Dmd.domain.Product;
@Service
public class CartService implements CartFacade{
	
	@Autowired
	private CartDao cartDao;
	public void setCartDao(CartDao cartDao) {
		this.cartDao = cartDao;
	}
	
	public void addCart(Cart cart) {
		cartDao.save(cart);
	}

	@Override
	public Product removeProdById(int prodId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setQuantityByProdId(int prodId, int qty) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cart> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void incrementQuantityByeProductId(int prodId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getSubTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Cart getCart(int prodId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cart> findByUserId(String userId) {
		// TODO Auto-generated method stub
		return cartDao.findByUserId(userId);
	}

	
}
