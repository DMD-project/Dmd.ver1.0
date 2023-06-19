package ddwu.spring.Dmd.service;

import java.util.List;

import ddwu.spring.Dmd.domain.Order;

public interface OrderFacade {
	
	void insertOrder(Order order);

	Order getOrder(int orderId);

	List<Order> getOrdersByUsername(String username);
}
