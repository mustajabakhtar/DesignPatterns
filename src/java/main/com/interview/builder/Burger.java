/**
 * 
 */
package com.interview.builder;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}
}
