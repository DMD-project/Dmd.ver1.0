package ddwu.spring.Dmd.domain;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.springframework.beans.support.PagedListHolder;

@SuppressWarnings("serial")
public class Cart implements Serializable {

	/* Private Fields */

	private final Map<Integer, CartItem> ProductMap = Collections.synchronizedMap(new HashMap<Integer, CartItem>());

	private final PagedListHolder<CartItem> cartItemList = new PagedListHolder<CartItem>();

	/* JavaBeans Properties */

	public Cart() {
		this.cartItemList.setPageSize(4);
	}

	public Iterator<CartItem> getAllCartProducts() {
		return cartItemList.getSource().iterator();
	}

	public PagedListHolder<CartItem> getCartItemList() {
		return cartItemList;
	}

	public int getNumberOfProducts() {
		return cartItemList.getSource().size();
	}

	/* Public Methods */

	public boolean containsProductId(int productId) {
		return ProductMap.containsKey(productId);
	}

	public void addProduct(Product product) {
		CartItem cartItem = ProductMap.get(product.getId());
		if (cartItem == null) {
			cartItem = new CartItem();
			cartItem.setProd(product);
			cartItem.setQty(0);
//			cartItem.setInStock(isInStock);
			ProductMap.put(product.getId(), cartItem);
			cartItemList.getSource().add(cartItem);
		}
		
		cartItem.incrementQuantity();
	}

	public Product removeProductById(int productId) {
		CartItem cartItem = ProductMap.remove(productId);
		if (cartItem == null) {
			return null;
		} else {
			cartItemList.getSource().remove(cartItem);
			return cartItem.getProd();
		}
	}

	public void incrementQuantityByeProductId(int productId) {
		CartItem cartItem = ProductMap.get(productId);
		cartItem.incrementQuantity();
	}

	public void setQuantityByProductId(int productId, int quantity) {
		CartItem cartItem = ProductMap.get(productId);
		cartItem.setQty(quantity);
	}

	public double getSubTotal() {
		double subTotal = 0;
		Iterator<CartItem> items = getAllCartProducts();
		while (items.hasNext()) {
			CartItem cartItem = (CartItem) items.next();
			Product prod = cartItem.getProd();
			int listPrice = prod.getPrice();
			int quantity = cartItem.getQty();
			subTotal += listPrice * quantity;
		}
		return subTotal;
	}

}
