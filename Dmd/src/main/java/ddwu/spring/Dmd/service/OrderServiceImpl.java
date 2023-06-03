package ddwu.spring.Dmd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ddwu.spring.Dmd.dao.OrderDao;
import ddwu.spring.Dmd.domain.Order;

public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderDao orderDao;
	
	public Order getOrder(int orderId) {
		return orderDao.getOrder(orderId);
	}
	
	public List<Order> getOrdersByUserId(String userId) {
		return orderDao.findByUserId(userId);
	}

	public List<Order> getOrdersByUsername(String username) {
		return orderDao.findByUsername(username);
	}

}