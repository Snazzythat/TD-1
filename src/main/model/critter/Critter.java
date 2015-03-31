package main.model.critter;

import main.model.Vector2D;

/**
 * The abstract Critter class
 * 
 * @author justin.bell
 * @version 0.1
 * 
 */
public abstract class Critter {
	protected Vector2D position;
	protected Vector2D targetPosition;
	protected int health;
	protected int strength;
	protected int speed;
	protected int reward;
	protected boolean armour;
	
	public Critter() {}
	
	/**
	 * returns the position of the critter
	 * @return the position of the critter
	 */
	public Vector2D getPosition() {
		return position;
	}
	
	/**
	 * returns the health of the critter
	 * @return the health of the critter
	 */
	public int getHealth() {
		return health;
	}
	
	/**
	 * returns the strength of the critter
	 * @return the strength of the critter
	 */
	public int getStrength() {
		return strength;
	}
	
	/**
	 * returns reward of the critter
	 * @return reward of the critter
	 */
	public int getReward() {
		return reward;
	}
	
	/**
	 * returns true if the critter is armoured; else false
	 * @return true if the critter is armoured; else false
	 */
	public boolean isArmoured() {
		return armour;
	}
	
	/**
	 * sets the targetPosition (i.e. the position where the critter is heading)
	 * @param targetPosition
	 */
	public void setTargetPosition(Vector2D targetPosition) {
		this.targetPosition = targetPosition;
	}
	
	/**
	 * gets the velocity of the critter
	 * @return the velocity of the critter
	 */
	public Vector2D getVelocity() {
		Vector2D displacementVector = position.getDisplacementVector(targetPosition);
		Vector2D normalizedDisplacementVector = displacementVector.getNormalizedVector2D();
		Vector2D velocityVector = normalizedDisplacementVector.getScalarMultiple(speed);
		return velocityVector;
	}
	
	/**
	 * moves the position of the critter according to its speed
	 */
	public void move() {
		position.add(getVelocity());
	}
	
	/**
	 * Returns true if the critter is dead; else false
	 * @return true if the critter is dead; else false
	 */
	public boolean isDead() {
		if(health < 0) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Reduces health by an int, damage
	 * @param damage
	 */
	public void takeDamage(int damage) {
		health -= damage;
	}
}
