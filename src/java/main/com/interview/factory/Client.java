/**
 * 
 */
package com.interview.factory;

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
		ShapeFactory sf = new ShapeFactory();
		Shape s= sf.getFactoryObject("circle");
        s.draw();
	}

}
