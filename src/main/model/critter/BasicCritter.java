package main.model.critter;

import main.model.critter.Critter;

/**
 * Basic Critter is a Critter with standard characteristics
 * @author justin.bell
 * @version 0.1
 */
public class BasicCritter extends Critter {
	
	/**
	 * BasicCritter constructor. Takes an int input, level, that influences the power of the critter
	 * @param level
	 */
	public BasicCritter(int level) {
		//TODO tweak critter stats
		health = level;
		strength = level;
		speed = level;
		reward = level;
		armour = false;
	}
}
