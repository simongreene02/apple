package practice.exam4;

public class Question33 {
	public static void main(String[] args) {
		long x = (int)Math.pow(2, 5);
		System.out.println(140737488355328L % Integer.MAX_VALUE);
		System.out.println(x);
		for (int k = 1; k <= 3; k++) {
			x *= (2*x);
			System.out.println(x);
		}
	}
}
