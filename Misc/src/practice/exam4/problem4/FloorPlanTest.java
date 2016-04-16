package practice.exam4.problem4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class FloorPlanTest {
	private FloorPlan floorPlan;

	@Before
	public void setUp() throws Exception {
		int[][] data = new int[5][5];
		data[0] = new int[] { 0, 0, 1, 0, 0 };
		data[1] = new int[] { 0, 1, 0, 1, 0 };
		data[2] = new int[] { 0, 0, 0, 0, 0 };
		data[3] = new int[] { 1, 0, 0, 0, 0 };
		data[4] = new int[] { 1, 0, 0, 0, 0 };

		floorPlan = new FloorPlan(data);
	}
	
	@Test
	public void whereFits_tinyObject_lengthOf20() {
//		ImmutableList l = ImmutableList.of(Location.builder().row().col().build(),);
		List<Location> expectedLocations = new ArrayList();
		expectedLocations.add(new Location(3,2));
		expectedLocations.add(new Location(3,3));
		expectedLocations.add(new Location(3,4));
		expectedLocations.add(new Location(4,2));
		expectedLocations.add(new Location(4,3));
		expectedLocations.add(new Location(4,4));
		assertEquals(6, floorPlan.whereFits(1, 1).size());
		assertEquals(expectedLocations, floorPlan.whereFits(1, 1));
	}
	
	@Test
	public void fits_bigTopRightBottomWithoutOnes_doesFit() {
		assertTrue(floorPlan.fits(3, 2, new Location(3, 2)));
	}

	@Test
	public void fits_topRightBottomWithOnes_dosntFit() {
		assertFalse(floorPlan.fits(1, 3, new Location(2, 0)));
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
		assertTrue(floorPlan.isEmptyRegion(6, 7, 1, 4));
	}

	@Test(expected = IllegalArgumentException.class)
	public void initalization_empty() {
		new FloorPlan(new int[0][0]);
	}

	@Test
	public void isEmptyRegion_topRightBottomWithOnes_notEmpty() {
		assertFalse(floorPlan.isEmptyRegion(2, 3, 0, 3));
	}

	@Test
	public void isEmptyRegion_topRightBottomWithOnes_isEmpty() {
		assertTrue(floorPlan.isEmptyRegion(3, 4, 2, 3));
	}

	@Test
	public void fits_topRightBottomWithOnes_doesFit() {
		assertTrue(floorPlan.fits(1, 1, new Location(3, 2)));
	}

}
