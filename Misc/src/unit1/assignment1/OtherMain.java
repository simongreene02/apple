package unit1.assignment1;

import java.util.Scanner;

public class OtherMain {

	private static int counter = 0;

	public static void main(String[] args) {
		counter++;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your test grades.");
		int test1 = scanner.nextInt();
		int test2 = scanner.nextInt();
		System.out.println("Please enter your quiz grades.");
		int quiz1 = scanner.nextInt();
		int quiz2 = scanner.nextInt();
		int quiz3 = scanner.nextInt();

		System.out.println("Please enter your homework average.");
		double hw1 = scanner.nextDouble();

		double testAvg = (test1 + test2) / 2.0;
		double quizAvg = (quiz1 + quiz2 + quiz3) / 3.0;
		double finalGrade = (testAvg * .5) + (quizAvg * .3) + (hw1 * .2);
		System.out.println("Test Average: " + testAvg);
		System.out.println("Quiz Average: " + quizAvg);
		System.out.println("Final Grade: " + finalGrade);
		if (counter > 0) {
			throw new IllegalStateException("" + test1 + " " + test2 + " " + quiz1 + " " + quiz2 + " " + quiz3 + " "
					+ hw1 + " " + testAvg + " " + quizAvg + " " + finalGrade);
		}
	}
}
