package ddwu.spring.Dmd.service;

import ddwu.spring.Dmd.dao.OrderDao;
import ddwu.spring.Dmd.domain.Order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {
	/*
		@Autowired 
		private OrderDao orderDao;
		public void setOrderDao(OrderDao orderDao) {
			this.OrderDao = orderDao;
		}
	*/
	
	Order getOrder(int orderId);
	
	public List<Order> getOrdersByUserId(String userId);
	
	public List<Order> getOrdersByUsername(String username);
	
}
