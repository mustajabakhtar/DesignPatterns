/**
 * 
 */
package com.interview.abstractfactory;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public class FactoryProducer {

	/**
	 * 
	 */
	public FactoryProducer() {
		// TODO Auto-generated constructor stub
	}

	public static AbstractFactory getFactory(String c) {
		if (c == null) {
			return null;
		}
		switch (c) {
		case "COLOR":
			return new ColorFactory();
		case "SHAPE":
			return new ShapeFactory();
		}
		return null;
	}
}
