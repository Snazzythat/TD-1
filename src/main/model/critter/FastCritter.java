package main.model.critter;

/**
 * Faster subCritter of Critter
 * @author justin.bell
 * @version 0.1
 */
public class FastCritter extends Critter {
	/**
	 * FastCritter constructor. Takes an int input, level, that influences the power of the critter
	 * @param level
	 */
	public FastCritter(int level) {
		//TODO tweak critter stats
		health = level;
		strength = level;
		speed = level*2;
		reward = level;
		armour = false;
	}
}
