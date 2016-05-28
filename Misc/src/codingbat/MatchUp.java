package codingbat;

public class MatchUp {
	public static int matchUp(String[] a, String[] b) {
		int output = 0;
		if (a.length != b.length) {
			throw new IllegalArgumentException();
		}
		for (int i = 0; i < a.length; i++) {
			if (!a[i].isEmpty() && !b[i].isEmpty() && a[i].charAt(0) == b[i].charAt(0)) {
				output++;
			}
		}
		return output;
	}
}
