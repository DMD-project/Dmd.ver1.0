package ddwu.spring.Dmd.service;

import java.util.List;
import java.util.Optional;

import ddwu.spring.Dmd.domain.Order;

public interface OrderFacade {
	
	List<Order> findAll();

	Optional<Order> findById(int orderId);
	
	void addOrder(Order order);

	Order getOrder(int id);
	
	List<Order> findByUserID(String id);	
}
