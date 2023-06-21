package ddwu.spring.Dmd.service;

import ddwu.spring.Dmd.dao.OrderDao;
import ddwu.spring.Dmd.dao.SecondHandDao;
import ddwu.spring.Dmd.domain.GroupPurchase;
import ddwu.spring.Dmd.domain.Order;
import ddwu.spring.Dmd.domain.SecondHand;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

@Service
@Transactional
public class OrderService implements OrderFacade {
	
	@PersistenceContext
    private EntityManager em;
	
	@Autowired
	private OrderDao orderDao;
	
	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	@Override
	public List<Order> findAll() {
		return (List<Order>)orderDao.findAll();
	}

	@Override
	public Optional<Order> findById(int orderId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void addOrder(Order order) {
		orderDao.save(order);
	}

	@Override
	public Order getOrder(int id) {
		Optional<Order> result = orderDao.findById(id);
		if(result.isPresent()) return result.get();
		return null;
	}

	@Override
	public List<Order> findByUserID(String id) {
		return orderDao.findByUserID(id);
	}
	
	
}
