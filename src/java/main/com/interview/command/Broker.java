/**
 * 
 */
package com.interview.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public class Broker {

	private List<Order> orderList = new ArrayList<Order>();

	/**
	 * 
	 */
	public Broker() {
		// TODO Auto-generated constructor stub
	}

	public void takeOrder(Order order) {
		orderList.add(order);
	}

	public void placeOrder() {
		for (Order o : orderList) {
			o.execute();
		}
		orderList.clear();
	}
}
