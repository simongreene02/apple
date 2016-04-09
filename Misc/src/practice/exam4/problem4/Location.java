package practice.exam4.problem4;

public class Location {
	private final int row;
	private final int col;
	public Location(int row, int col) {
		this.row = row;
		this.col = col;
	}
	public int getRow() {
		return row;
	}
	public int getCol() {
		return col;
	}
	@Override
	public String toString() {
		return "Location [row=" + row + ", col=" + col + "]";
	}
}
