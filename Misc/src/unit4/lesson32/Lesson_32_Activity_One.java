package unit4.lesson32;

/**
 * 
 * Write a method that takes a parameter for the number of a month and prints
 * the month's name. This method must be called monthName() and it must have an
 * integer parameter. Calling monthName(8) should print August to the screen.
 * 
 * @author ninja
 */

public class Lesson_32_Activity_One {
	public static String trueMonthName(int monthNumber) {
		String[] monthList = new String[] { "January", "Febuary", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December" };
		if (monthNumber > 12 || monthNumber < 1) {
			throw new IllegalArgumentException("The number entered was not a number between 1 and 12");
		}
		return monthList[monthNumber - 1];
	}

	public static void monthName(int monthNumber) {
		System.out.println(trueMonthName(monthNumber));
	}
}