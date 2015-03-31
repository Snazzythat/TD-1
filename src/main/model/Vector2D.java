package main.model;

/**
 * 
 * @author justin.bell
 * @version 0.1
 *
 */
public class Vector2D {
	private int x;
	private int y;
	
	/**
	 * 
	 * @param x
	 * @param y
	 */
	public Vector2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * returns the x coordinate of the vector
	 * @return the x coordinate of the vector
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * returns the y coordinate of the vector
	 * @return the y coordinate of the vector
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * sets the x coordinate of the vector
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * sets the y coordinate of the vector
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * gets a normalized version of the vector
	 * @return normalized version of the vector
	 */
	public Vector2D getNormalizedVector2D() {
		double divider = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		int normalizedX = (int)(x/divider);
		int normalizedY = (int)(y/divider);
		Vector2D normalizedVector2D = new Vector2D(normalizedX, normalizedY);
		return normalizedVector2D;
	}
	
	/**
	 * returns a vector multiplied by the int scalar, n
	 * @param n
	 * @return the vector multiplied by the int scalar, n
	 */
	public Vector2D getScalarMultiple(int n) {
		Vector2D v = new Vector2D(n*x, n*y);
		return v;
	}
	
	/**
	 * returns the displacement between this vector and vector v
	 * @param v
	 * @return the displacement between this vector and vector v
	 */
	public Vector2D getDisplacementVector(Vector2D v) {
		int displacementX = x - v.getX();
		int displacementY = y = v.getY();
		Vector2D displacementVector = new Vector2D(displacementX, displacementY);
		return displacementVector;
	}
	
	/**
	 * adds this vector to vector v
	 * @param v
	 */
	public void add(Vector2D v) {
		this.x += v.getX();
		this.y += v.getY();
	}
} 
