package unit2.lesson14;

/*
 * Lesson 14 Coding Activity 2
 * Write a program to input two integers and print 
 * "Both are positive or zero." to the screen, if both are positive or zero.
 * Print "One or both are negative." otherwise.
 */
import java.util.Scanner;

public class Activity2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number1 = scanner.nextInt();
		System.out.println("Enter a number:");
		int number2 = scanner.nextInt();
		if (number1 >= 0 && number2 >= 0) {
			System.out.println("Both are positive or zero.");
		} else {
			System.out.println("One or both are negative.");
		}
	}
}