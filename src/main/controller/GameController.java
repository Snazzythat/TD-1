package main.controller;

import main.model.Vector2D;
import main.model.Observable;
import main.model.critter.*;

/**
 * Controller to interact with views and models related to gameplay. Note: This is a singleton
 * @author justin.bell
 * @version 0.1
 */
public class GameController extends Observable{
	private static GameController instance;
	private CritterManager cm;
	
	private GameController() {
		cm = new CritterManager();
	};
	
	/**
	 * returns an instance of this class
	 * @return
	 */
	public static GameController getInstance() {
		if (instance == null) {
			instance = new GameController();
		}
		return instance;
	}
	
	/**
	 * Adds a critter to the CritterManager
	 */
	public void addCritter() {
		//TODO add parameters to this method
		Vector2D startingPosition = new Vector2D(0,0);
		cm.addCritter(1, startingPosition);
		notifyObservers();
	}
	
	/**
	 * returns the number of Critters that CritterManager has
	 * @return number of critters
	 */
	public int getNumberOfCritters() {
		return cm.countCritters(); 
	}
}
