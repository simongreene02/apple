package unit2.assignment3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] months = new String[]{"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		System.out.println("What month were you born in? (number)");
		int month = scanner.nextInt();
		System.out.println("What day (number)");
		int day = scanner.nextInt();
		if (month < 1 || month > 12 || day < 1 || day > 31) {
			System.out.println("error");
			System.exit(1);
		}
		System.out.print("Your birthday is: " + months[month-1] + " " + findDate(day));

	}
	private static String findDate(int number) {
		if (number == 1) {
			return "first";
		}
		if (number == 2) {
			return "second";
		}
		if (number == 3) {
			return "thrird";
		}
		if (number == 4) {
			return "fourth";
		}
		if (number == 5) {
			return "fifth";
		}
		if (number == 6) {
			return "sixth";
		}
		if (number == 7) {
			return "seventh";
		}
		if (number == 8) {
			return "eighth";
		}
		if (number == 9) {
			return "ninth";
		}
		if (number == 10) {
			return "tenth";
		}
		if (number == 11) {
			return "eleventh";
		}
		if (number == 12) {
			return "twelveth";
		}
		if (number == 13) {
			return "thirteenth";
		}
		if (number == 14) {
			return "fourteenth";
		}
		if (number == 15) {
			return "fifteenth";
		}
		if (number == 16) {
			return "sixteenth";
		}
		if (number == 17) {
			return "seventeenth";
		}
		if (number == 18) {
			return "eighteenth";
		}
		if (number == 19) {
			return "nineteenth";
		}
		if (number == 20) {
			return "twentyth";
		}
		if (number > 20 || number < 30) {
			return "twenty-" + findDate(number - 20);
		}
		if (number == 30) {
			return "thirtyth";
		}
		
		return "thirty-first";
		
	}

}
