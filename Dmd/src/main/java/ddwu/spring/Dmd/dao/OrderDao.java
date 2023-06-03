package ddwu.spring.Dmd.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ddwu.spring.Dmd.domain.Order;

@Repository
public interface OrderDao extends CrudRepository<Order, String>{

	List<Order> findByUsername(String username) ;
	List<Order> findByUserId(String userId);
	Order getOrder(int orderId);
	
	//void addOrder(Order order) throws DataAccessException;
	//void deleteOrder(Order order) throws DataAccessException;
	
}
