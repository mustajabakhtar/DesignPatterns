/**
 * 
 */
package com.interview.observer;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public abstract class Observer {

	protected Subject subject;

	public abstract void update();
}
