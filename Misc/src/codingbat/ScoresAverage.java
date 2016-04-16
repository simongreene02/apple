package codingbat;

public class ScoresAverage {

	public static int scoresAverage(int[] scores) {
		int midpoint = scores.length / 2;
		int firstAverage = average(scores, 0, midpoint);
		int secondAverage = average(scores, midpoint, scores.length);
		return Math.max(firstAverage, secondAverage);
	}

	public static int average(int[] scores, int start, int end) {
		int average = 0;
		for (int i = start; i < end; i++) {
			average += scores[i];
		}
		return average / (end - start);
	}

}
