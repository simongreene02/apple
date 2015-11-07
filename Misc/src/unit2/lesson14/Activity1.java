package unit2.lesson14;
/*
 * Lesson 14 Coding Activity 1
 * Test if an integer is not between 5 and 76 inclusive.
 *
 *     Sample Run 1
 *         Enter a number:
 *         7
 *         False
 *
 *         
 *      Sample Run 2
 *         Enter a number:
 *         1   
 *         True
 * 
 */
import java.util.Scanner;

public class Activity1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = scanner.nextInt();
		if (number < 5 || number > 76) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}