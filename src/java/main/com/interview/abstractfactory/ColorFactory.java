/**
 * 
 */
package com.interview.abstractfactory;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public class ColorFactory extends AbstractFactory {

	/**
	 * 
	 */
	public ColorFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		if (color == null) {
			return null;
		}
		switch (color) {
		case "RED":
			return new Red();
		case "GREEN":
			return new Green();
		case "BLUE":
			return new Blue();
		}
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
