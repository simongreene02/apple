package practice.exam4.problem4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FloorPlanTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void zeroTest() {
		FloorPlan floorPlan = new FloorPlan(10, 20);
		int[][] room = floorPlan.getRoom();
		for (int row = 0; row < 10; row++) {
			for (int col = 0; col < 20; col++) {
				assertEquals(0, room[row][col]);
			}
		}
	}

}
