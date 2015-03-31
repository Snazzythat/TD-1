package main.model.critter;

import java.util.ArrayList;
import java.util.List;
import main.model.critter.CritterFactory;

/**
 * CritterManager keeps a reference and manipulates all initialized Critters
 * @author justin.bell
 * @version 0.1
 */
public class CritterManager {
	private List<Critter> critterList = new ArrayList<Critter>();
	
	/**
	 * adds a critter to the CritterManager's list with an int, level, as an input
	 * @param level
	 */
	public void addCritter(int level) {
		Critter critter = CritterFactory.createRandomCritter(level);
		critterList.add(critter);
	}
	
	/**
	 * removes a Critter, critter, from the CritterManager's list
	 * @param critter
	 */
	public void removeCritter(Critter critter) {
		critterList.remove(critter);
	}
	
	/**
	 * gets the CritterManager's list of Critters
	 * @return
	 */
	public List<Critter> getCritters() {
		List<Critter> critterList = this.critterList;
		return critterList;
	}
	
	/**
	 * executes one frame of critter logic
	 */
	public void update() {
		//TODO build logic critter logic
	}
	
	
}
