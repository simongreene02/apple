package unit1.assignment2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the Cost of the Item:");
		final int cost = (int) (scanner.nextFloat() * 100);
		System.out.println("Please Enter the Amount Paid:");
		final int paid = (int) (scanner.nextFloat() * 100);
		int change = paid - cost;
		System.out.println("Change Owed: " + change / 100.00);
		int quarters = (int) (change / 25);
		change = change % 25;
		System.out.println("Quarters: " + quarters);
		int dimes = change / 10;
		change = change % 10;
		System.out.println("Dimes: " + dimes);
		int nickels = change / 5;
		change = change % 5;
		System.out.println("Nickels: " + nickels);
		int pennies = change / 1;
		change = change % 1;
		System.out.println("Pennies: " + pennies);

	}

}
