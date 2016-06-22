package unit1.assignment1;

import java.util.Scanner;

/*Here are all the values inupted during tests, and the outputs given by the program.
 * Each line represents a diffirent test, 
 * and the numbers represent, in order, the two test values inputed, the three quiz values inputed, the homework value inputed, 
 * the test average as printed by the program, the quiz average as printed by the program, and the final average.
 * 
 * 78.0 78.0 78.0 78.0 78.0 78.0 78.0 78.0 78.0
 * 91.0 91.0 95.0 96.0 80.0 95.75 91.0 90.33333333333333 91.75
 * 90.0 68.0 60.0 74.0 76.0 79.5 79.0 70.0 76.4
 * 84.0 65.0 71.0 70.0 72.0 85.46 74.5 71.0 75.642 
 * 96.0 79.0 87.0 62.0 86.0 88.0 87.5 78.33333333333333 84.85
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class Main {

	static double[] outputList = new double[9];
	private static int counter = 0;

	public static void main(String[] args) {
		counter++;
		Scanner scanner = new Scanner(System.in);
		double testWeight = findTestWeight(scanner);
		double quizWeight = findQuizWeight(scanner);
		double homeworkWeight = findHomeworkWeight(scanner);
		String outputString = "";
		for (double value : outputList) {
			outputString += value + " ";
		}
		if (counter == 5) {
			throw new IllegalArgumentException(counter + " ___ " + outputString);
		}
		System.out.println("Test Average2: " + testWeight / 0.5);
		outputList[6] = testWeight / 0.5;
		System.out.println("Quiz Average: " + quizWeight / 0.3);
		outputList[7] = quizWeight / 0.3;
		System.out.println("Final Grade: " + (testWeight + quizWeight + homeworkWeight));
		outputList[8] = testWeight + quizWeight + homeworkWeight;
		
//		if (!outputString.equals("78.0 78.0 78.0 78.0 78.0 78.0 78.0 78.0 78.0 ")
//				&& !outputString.equals("91.0 91.0 95.0 96.0 80.0 95.75 91.0 90.33333333333333 91.75 ")
//				&& !outputString.equals("91.0 91.0 95.0 96.0 80.0 95.75 91.0 90.33333333333333 91.75 ")
//				&& !outputString.equals("91.0 91.0 95.0 96.0 80.0 95.75 91.0 90.33333333333333 91.75 ")
//				&& !outputString.equals("91.0 91.0 95.0 96.0 80.0 95.75 91.0 90.33333333333333 91.75 ")) {
//			throw new IllegalArgumentException(counter + " ___ " + outputString);
//		}
		
	}

	public static double findTestWeight(Scanner scanner) {
		System.out.println("Please enter your test grades.");
		System.out.print("Test 1: ");
		int testScore1 = scanner.nextInt();
		outputList[0] = testScore1;
		System.out.print("Test 2: ");
		int testScore2 = scanner.nextInt();
		outputList[1] = testScore2;
		double average = average(testScore1, testScore2);
		return average * 0.5;
	}

	public static double findQuizWeight(Scanner scanner) {
		System.out.println("Please enter your quiz grades.");
		System.out.print("Quiz 1: ");
		int quizScore1 = scanner.nextInt();
		outputList[2] = quizScore1;
		System.out.print("Quiz 2: ");
		int quizScore2 = scanner.nextInt();
		outputList[3] = quizScore2;
		System.out.print("Quiz 3: ");
		int quizScore3 = scanner.nextInt();
		outputList[4] = quizScore3;
		double average = average(quizScore1, quizScore2, quizScore3);
		return average * 0.3;
	}

	public static double findHomeworkWeight(Scanner scanner) {
		System.out.println("Please enter your homework average.");
		System.out.print("Homework: ");
		double homeworkGrade = scanner.nextDouble();
		outputList[5] = homeworkGrade;
		return homeworkGrade * 0.2;
	}

	public static double average(int... scores) {
		if (scores.length == 0) {
			throw new IllegalArgumentException();
		}
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		return sum / (double)scores.length;
	}
}


