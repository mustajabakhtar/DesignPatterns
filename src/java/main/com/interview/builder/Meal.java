/**
 * 
 */
package com.interview.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public class Meal {

	/**
	 * 
	 */
	public Meal() {
		// TODO Auto-generated constructor stub
	}

	private List<Item> listOfItems = new ArrayList<Item>();

	public void addItem(Item item) {
		listOfItems.add(item);
	}

	public Float getCost() {
		Float cost = 0.0f;
		for (Item item : listOfItems) {
			cost = cost + item.price();
		}
		return cost;
	}

	public void showItems() {
		for (Item item : listOfItems) {
			System.out.println("Name:" + item.name());
			System.out.println("Packing:" + item.packing().pack());
			System.out.println("Price:" + item.price());
		}
	}

}
