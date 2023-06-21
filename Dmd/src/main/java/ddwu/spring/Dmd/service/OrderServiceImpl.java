package ddwu.spring.Dmd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ddwu.spring.Dmd.dao.OrderDao;
import ddwu.spring.Dmd.domain.Order;

public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderDao orderDao;
	
	public Order getOrder(int orderId) {
		return orderDao.getOrder(orderId);
	}
	
	public List<Order> getOrdersByUsername(String username) {
		return null;
	}

}