package practice.exam4.problem4;

import java.util.ArrayList;

public class FloorPlan {
	private final int ROWS;
	private final int COLS;
	private int[][] room;

	public FloorPlan(int rows, int cols) {
		ROWS = rows;
		COLS = cols;
		room = new int[ROWS][COLS];
	}

	private boolean isEmptyRegion(int top, int bottom, int left, int right) {
		throw new UnsupportedOperationException("Not Implemented Yet");
	}

	public boolean fits(int width, int height, Location ulCorner) {
		throw new UnsupportedOperationException("Not Implemented Yet");
	}

	public ArrayList<Location> whereFits(int width, int height) {
		throw new UnsupportedOperationException("Not Implemented Yet");
	}

	int[][] getRoom() {
		return room;
	}

}
