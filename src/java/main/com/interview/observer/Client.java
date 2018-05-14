/**
 * 
 */
package com.interview.observer;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public class Client {

	/**
	 * 
	 */
	public Client() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Subject sub = new Subject();
        new HexObserver(sub);
        new BinaryObserver(sub);
        new DecimalObserver(sub);
        
        sub.setState(12);
        sub.setState(14);
	}

}
