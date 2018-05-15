/**
 * 
 */
package com.interview.command;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public class BuyStock implements Order {

	private Stock stock;

	/**
	 * 
	 */
	public BuyStock(Stock stock) {
		// TODO Auto-generated constructor stub
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.buy();

	}

}
