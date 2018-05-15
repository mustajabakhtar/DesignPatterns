/**
 * 
 */
package com.interview.factory;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public class ShapeFactory {

	/**
	 * 
	 */
	public ShapeFactory() {
		// TODO Auto-generated constructor stub
	}

	public Shape getFactoryObject(String type) {
		switch (type) {
		case "circle":
			return new Circle();
		case "rectangle":
			return new Rectangle();
		case "square":
			return new Square();
		}
		return null;
	}

}
