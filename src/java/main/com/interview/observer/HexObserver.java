/**
 * 
 */
package com.interview.observer;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public class HexObserver extends Observer {

	/**
	 * 
	 */
	public HexObserver(Subject subject) {
		super();
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Hex value :" + Integer.toHexString(subject.getState()));
	}

}
