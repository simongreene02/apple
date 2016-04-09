package practice.exam4.problem4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FloorPlanTest {
	private FloorPlan floorPlan;
	@Before
	public void setUp() throws Exception {
		int [][] data = new int[5][5];
		data[0] = new int[]{0,0,1,0,0};
		data[0] = new int[]{0,1,0,1,0};
		data[0] = new int[]{0,1,0,1,0};
		data[0] = new int[]{1,0,0,0,1};
		data[0] = new int[]{1,0,0,0,1};

		floorPlan = new FloorPlan(data);
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

	@Test
	public void isEmptyRegion_allSides() {
		FloorPlan floorPlan = new FloorPlan(8, 9);
		int[][] room = floorPlan.getRoom();
		assertTrue(floorPlan.isEmptyRegion(2, 3, 2, 5));
	}

	@Test
	public void isEmptyRegion_topRightBottom() {
		FloorPlan floorPlan = new FloorPlan(8, 9);
		int[][] room = floorPlan.getRoom();
		assertTrue(floorPlan.isEmptyRegion(2, 3, 0, 3));
	}

	@Test
	public void isEmptyRegion_topRight() {
		FloorPlan floorPlan = new FloorPlan(8, 9);
		int[][] room = floorPlan.getRoom();
		assertTrue(floorPlan.isEmptyRegion(6, 7, 0, 3));
	}

	@Test
	public void isEmptyRegion_topLeftRight() {
		FloorPlan floorPlan = new FloorPlan(8, 9);
		int[][] room = floorPlan.getRoom();
		assertTrue(floorPlan.isEmptyRegion(7, 8, 1, 4));
	}

	@Test(expected = IllegalArgumentException.class)
	public void initalization_empty() {
		new FloorPlan(new int[0][0]);
	}
	
	@Test
	public void isEmptyRegion_topRightBottomWithOnes() {
		assertFalse(floorPlan.isEmptyRegion(2, 3, 0, 3));
	}

}
