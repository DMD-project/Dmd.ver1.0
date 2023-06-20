package ddwu.spring.Dmd.controller;

import java.io.Serializable;

import ddwu.spring.Dmd.domain.Order;
import ddwu.spring.Dmd.domain.SecondHand;

@SuppressWarnings("serial")
public class OrderForm implements Serializable {

	private Order order;
	
	public OrderForm() {
		this.order = new Order();
	}
	
	public OrderForm(Order order) {
		this.order = order;
	}
	
	public Order getOrder() {
		return order;
	}

}
