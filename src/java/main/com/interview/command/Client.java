/**
 * 
 */
package com.interview.command;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public class Client {

	/**
	 * 
	 */
	public Client() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock s = new Stock();
		BuyStock bs = new BuyStock(s);
		SellStock ss = new SellStock(s);
		Broker b = new Broker();
		b.takeOrder(bs);
		b.takeOrder(ss);
		b.placeOrder();

	}

}
