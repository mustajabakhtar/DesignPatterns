/**
 * 
 */
package com.interview.observer;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public class BinaryObserver extends Observer {

	/**
	 * 
	 */
	public BinaryObserver(Subject subject) {
		super();
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Binary string :" + Integer.toBinaryString(subject.getState()));

	}

}
