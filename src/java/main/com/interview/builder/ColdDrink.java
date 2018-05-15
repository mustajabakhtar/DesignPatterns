/**
 * 
 */
package com.interview.builder;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public abstract class ColdDrink implements Item {

	/**
	 * 
	 */
	public ColdDrink() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Packing packing() {
		return new Bottle();
	}

}
