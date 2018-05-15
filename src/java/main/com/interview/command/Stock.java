/**
 * 
 */
package com.interview.command;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public class Stock {
	
	private String name = "ABC";
	private Integer quantity = 10;

	/**
	 * 
	 */
	public Stock() {
		// TODO Auto-generated constructor stub
	}

	public void sell() {
		System.out.println("Sell stock name:" + name + " Quantity:" + quantity);
	}

	public void buy() {
		System.out.println("Buy stock name:" + name + " Quantity:" + quantity);
	}
}
