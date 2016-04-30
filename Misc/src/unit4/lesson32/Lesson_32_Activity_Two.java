package unit4.lesson32;

/**
 * Write a method that takes a parameter for the number of a month and prints
 * the number of days in the month. Assume that February will always have 28
 * days for this activity. This method must be called monthDays() and it must
 * take a integer parameter. Calling monthDays(2) would print 28 and
 * monthDays(9) would print 30.
 * 
 * @author ninja
 */
public class Lesson_32_Activity_Two {
	public static int trueMonthDays(int monthNumber) {
		int[] monthList = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (monthNumber > 12 || monthNumber < 1) {
			throw new IllegalArgumentException("The number entered was not a number between 1 and 12");
		}
		return monthList[monthNumber - 1];
	}

	public static void monthDays(int monthNumber) {
		System.out.println(trueMonthDays(monthNumber));
	}
}
