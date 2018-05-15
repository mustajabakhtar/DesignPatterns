/**
 * 
 */
package com.interview.proxy;

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
		// TODO Auto-generated method stub

		Image image = new ProxyImage("mustajab.jpg");
		
		//Image will be loaded from disk
		image.display();
		
		//Image will not be loaded from disk
		image.display();
	}

}
