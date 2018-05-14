/**
 * 
 */
package com.interview.observer;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public class DecimalObserver extends Observer {

	/**
	 * 
	 */
	public DecimalObserver(Subject subject) {
		super();
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Decimal value is :" + subject.getState());

	}

}
