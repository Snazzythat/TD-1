package main.model.critter;

/**
 * Stronger subCritter of Critter
 * @author justin.bell
 * @version 0.1
 */
public class StrongCritter extends Critter {
	/**
	 * FastCritter constructor. Takes an int input, level, that influences the power of the critter
	 * @param level
	 */
	public StrongCritter(int level) {
		//TODO tweak critter stats
		health = level;
		strength = level*2;
		speed = level;
		reward = level;
		armour = true;
	}
}
