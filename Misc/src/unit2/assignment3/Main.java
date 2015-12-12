package unit2.assignment3;

import java.util.Scanner;

/**
Aquarius 20 January – 18 February
Pisces 19 February – 20 March
Aries 21 March – 19 April
Taurus 20 April – 20 May
Gemini 21 May – 20 June
Cancer 21 June – 22 July
Leo 23 July –22 August
Virgo 23 August – 22 September
Libra 23 September – 22 October
Scorpio 23 October – 21 November
Sagittarius 22 November – 21 December
Capricorn 22 December – 19 January
 */

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] months = new String[]{"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		String[] signs = new String[]{"Capricorn", "Aquarius", "Pisces", "Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius", "Capricorn"};
		
		int[] values = new int[]{20, 19, 21, 20, 21, 21, 23, 23, 23, 23, 22, 22};
		System.out.println("What month were you born in? (number)");
		int month = scanner.nextInt();
		System.out.println("What day (number)");
		int day = scanner.nextInt();
		if (month < 1 || month > 12 || day < 1 || day > 31) {
			System.out.println("error");
			return;
		} 
		System.out.println("Your birthday is: " + months[month-1] + " " + findDate(day));
		System.out.println(signs[(day >= values[month-1]) ? month : month - 1]);
		for (int i = 1; i < 32; i++){
			System.out.print("\"" + findDate(i) + "\", ");
		}
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
			return "twentieth";
		}
		if (number > 20 && number < 30) {
			return "twenty-" + findDate(number - 20);
		}
		if (number == 30) {
			return "thirtieth";
		}
		
		return "thirty-first";
		
	}

}
