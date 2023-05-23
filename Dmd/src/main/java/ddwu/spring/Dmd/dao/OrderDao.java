package ddwu.spring.Dmd.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

public class OrderDao {

	List<Order> getOrdersByUsername(String username) throws DataAccessException;
	
	Order getOrder(int orderId) throws DataAccessException;
	
	//void insertOrder(Order order) throws DataAccessException;
	
}
