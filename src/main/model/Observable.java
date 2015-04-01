package main.model;

import java.util.ArrayList;
import java.util.List;

import main.view.Observer;

/**
 * Observables are extended by models that want to update views/observers when they've changed
 * @author justin
 * @version 0.1
 */
public class Observable {
	List<Observer> observerList = new ArrayList<Observer>();
	
	/**
	 * adds an observer to this observables list of observers
	 * @param observer
	 */
	public void addObserver(Observer observer) {
		observerList.add(observer);
	}
	
	/**
	 * removes an observer from this observables list 
	 * @param observer
	 */
	public void removeObserver(Observer observer) {
		observerList.remove(observer);
	}
	
	/**
	 * notifies observers the model has changed
	 */
	public void notifyObservers() {
		for(Observer observer : observerList) {
			observer.update();
		}
	}
}
