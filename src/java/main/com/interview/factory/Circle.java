/**
 * 
 */
package com.interview.factory;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public class Circle implements Shape {

	/**
	 * 
	 */
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.interview.factory.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Drawing circle");
	}

}
