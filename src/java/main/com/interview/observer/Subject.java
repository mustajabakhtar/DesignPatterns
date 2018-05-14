/**
 * 
 */
package com.interview.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public class Subject {

	private List<Observer> listOfObserver;
	private Integer state;

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
		notifyAllObserver();
	}

	public void attach(Observer observer) {
		if (listOfObserver == null) {
			listOfObserver = new ArrayList<Observer>();
		}
		listOfObserver.add(observer);
	}

	public void notifyAllObserver() {
		for (Observer observer : listOfObserver) {
			observer.update();
		}
	}
}
