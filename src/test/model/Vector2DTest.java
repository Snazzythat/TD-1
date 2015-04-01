package test.model;

import static org.junit.Assert.*;
import main.model.Vector2D;

import org.junit.Test;

public class Vector2DTest {

	@Test
	public void testGetDisplacementVector() {
		Vector2D v1 = new Vector2D(1,1);
		Vector2D v2 = new Vector2D(2,1);
		
		Vector2D vd = v1.getDisplacementVector(v2);
		
		assertEquals(vd.getX(), -1);
		assertEquals(vd.getY(), 0);
	}

}
