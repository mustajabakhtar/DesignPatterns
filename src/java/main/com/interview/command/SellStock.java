/**
 * 
 */
package com.interview.command;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public class SellStock implements Order {

	private Stock stock;

	/**
	 * 
	 */
	public SellStock(Stock stock) {
		// TODO Auto-generated constructor stub
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.sell();

	}

}
