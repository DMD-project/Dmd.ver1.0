package ddwu.spring.Dmd.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;

import ddwu.spring.Dmd.domain.Order;

//@Repository
public interface OrderDao {

	List<Order> getOrdersByUsername(String username) throws DataAccessException;
	//List<Order> findByUserId(String userId);
	
	Order getOrder(int orderId) throws DataAccessException;
	
	//void addOrder(Order order) throws DataAccessException;
	//void deleteOrder(Order order) throws DataAccessException;
	
}
