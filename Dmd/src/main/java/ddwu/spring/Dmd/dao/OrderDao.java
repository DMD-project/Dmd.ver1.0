package ddwu.spring.Dmd.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import ddwu.spring.Dmd.domain.Order;

public interface OrderDao {

	List<Order> getOrdersByUsername(String username) throws DataAccessException;
	
	Order getOrder(int orderId) throws DataAccessException;
	
	void insertOrder(Order order) throws DataAccessException;
	
}
