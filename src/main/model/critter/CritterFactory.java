package main.model.critter;

/**
 * Critter Factory that builds different types of Critters based on level 
 * @author justin.bell
 * @version 0.2
 */
public class CritterFactory {
	
	/**
	 * Returns a critter given ints, level and type. Type 0 returns a BasicCritter. Otherwise a BasicCritter is returned
	 * @param level
	 * @param type
	 * @return Type 0 returns a BasicCritter. Otherwise a BasicCritter is returned
	 */
	private static Critter createCritter(int level, int type) {
		Critter critter;
		if(type == 0) {
			critter = new BasicCritter(level);
		} else if(type == 1) {
			critter = new FastCritter(level);
		} else if(type == 2) {
			critter = new StrongCritter(level);
		} else {
			critter = new BasicCritter(level);
		}
		return critter;	
	}
	
	/**
	 * Returns a random type of Critter given an int, level
	 * @param level
	 * @return random type of Critter
	 */
	public static Critter createRandomCritter(int level) {
		final int typesOfCritters = 3; 
		int randomInt = Math.round((float)Math.random()*typesOfCritters);
		Critter critter = createCritter(level, randomInt);
		return critter;
	}
}
