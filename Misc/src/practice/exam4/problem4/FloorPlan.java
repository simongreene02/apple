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
	
	FloorPlan(int[][] room) {
		if (room.length == 0) {
			throw new IllegalArgumentException("room must greater than 0");
		}
		this.room = room;
		ROWS = room.length;
		COLS = room[0].length;
	}

	boolean isEmptyRegion(final int top, final int bottom, final int left, final int right) {
		int trueTop = top;
		int trueBottom = bottom;
		int trueLeft = left;
		int trueRight = right;
		if (trueTop > 0) {
			trueTop--;
		}
		if (trueBottom < ROWS - 1) {
			trueBottom++;
		}
		if (trueLeft > 0) {
			trueLeft--;
		}
		if (trueRight < COLS - 1) {
			trueRight++;
		}
		for (int row = trueTop; row <= trueBottom; row++) {
			for (int col = trueLeft; col <= trueRight; col++) {
				System.out.print(row);
				if (room[row][col] == 1) {
					return false;
				}
			}
			System.out.println();
		}
		System.out.println("=======================================");
		return true;
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
