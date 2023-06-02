package ddwu.spring.Dmd.service;

import ddwu.spring.Dmd.domain.Order;

import java.util.List;

public interface OrderService {
	
	Order getOrder(int orderId);
	
	public List<Order> getOrdersByUserId(String userId);
	
	public List<Order> getOrdersByUsername(String username);
	
}
