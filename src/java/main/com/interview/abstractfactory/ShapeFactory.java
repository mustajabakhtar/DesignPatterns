/**
 * 
 */
package com.interview.abstractfactory;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public class ShapeFactory extends AbstractFactory {

	/**
	 * 
	 */
	public ShapeFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		if (shape == null) {
			return null;
		}
		switch (shape) {
		case "RECTANGLE":
			return new Rectangle();
		case "SQUARE":
			return new Square();
		case "CIRCLE":
			return new Circle();
		}
		return null;
	}

}
