/**
 * 
 */
package com.interview.abstractfactory;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public abstract class AbstractFactory {

	/**
	 * 
	 */
	public AbstractFactory() {
		// TODO Auto-generated constructor stub
	}

	public abstract Color getColor(String color);

	public abstract Shape getShape(String shape);
}
