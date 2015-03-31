package main.model.critter;

/**
 * Critter Factory that builds different types of Critters based on level 
 * @author justin.bell
 * @version 0.1
 */
public class CritterFactory {
	
	/**
	 * Returns a critter given ints, level and type. Type 0 returns a BasicCritter. Otherwise a BasicCritter is returned
	 * @param level
	 * @param type
	 * @return Type 0 returns a BasicCritter. Otherwise a BasicCritter is returned
	 */
	public Critter createCritter(int level, int type) {
		Critter critter;
		if(type == 0) {
			critter = new BasicCritter(level);
		}
		else {
			critter = new BasicCritter(level);
		}
		return critter;	
	}
	
	/**
	 * Returns a random type of Critter given an int, level
	 * @param level
	 * @return random type of Critter
	 */
	public Critter createRandomCritter(int level) {
		int randomInt = Math.round((float)Math.random());
		Critter critter = this.createCritter(level, randomInt);
		return critter;
	}
}
