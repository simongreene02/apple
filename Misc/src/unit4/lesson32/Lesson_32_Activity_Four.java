package unit4.lesson32;

/**
 * Write a method that accepts a number of seconds and prints the correct number
 * of hours, minutes and seconds.
 * 
 * This method must be called realTime() and its parameter must be an integer.
 * 
 * Caling realTime(6342) would print the following:
 * 
 * Hours: 1 Minutes: 45 Seconds: 42
 * 
 * @author ninja
 *
 */
public class Lesson_32_Activity_Four {
	public static String trueRealTime(int time) {
		int hours = (int) time / 3600;
		time = time % 3600;
		int minutes = (int) time / 60;
		time = time % 60;
		return String.format("Hours: %d\nMinutes: %d\nSeconds: %d", hours, minutes, time);
	}

	public static void realTime(int time) {
		System.out.println(trueRealTime(time));
	}
}
