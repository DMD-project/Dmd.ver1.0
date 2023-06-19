package ddwu.spring.Dmd.controller;

import java.io.Serializable;

import ddwu.spring.Dmd.domain.Order;

@SuppressWarnings("serial")
public class OrderForm implements Serializable {

	private final Order order = new Order();

	public Order getOrder() {
		return order;
	}

}

