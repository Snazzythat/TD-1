package main.model.critter;

import java.util.ArrayList;
import java.util.List;

import main.model.Vector2D;
import main.model.critter.CritterFactory;

/**
 * CritterManager keeps a reference and manipulates all initialized Critters
 * @author justin.bell
 * @version 0.2
 */
public class CritterManager {
	private List<Critter> critterList = new ArrayList<Critter>();
	
	/**
	 * adds a critter to the CritterManager's list
	 * @param level
	 * @param position
	 */
	public void addCritter(int level, Vector2D position) {
		Critter critter = CritterFactory.createRandomCritter(level);
		critter.setPosition(position);
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
		return critterList;
	}
	
	/**
	 * updates movement of critters according to one unit of time
	 */
	public void moveCritters() {
		for(Critter critter : critterList) {
			critter.move();
		}
	}
}
