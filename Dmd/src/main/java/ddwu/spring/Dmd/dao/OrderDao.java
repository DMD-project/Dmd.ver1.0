package ddwu.spring.Dmd.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ddwu.spring.Dmd.domain.Order;

@Repository
public interface OrderDao extends CrudRepository<Order, String> {
	
	List<Order> findAll();
	
	Optional<Order> findById(int id);
	
	List<Order> findByUserID(String id);
	
//	void addOrder(Order order);
//	Order getOrder(int orderId);
	
}
