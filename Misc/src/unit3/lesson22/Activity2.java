package unit3.lesson22;

import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = scanner.nextLine();
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("\t");
			}
			System.out.println(input.charAt(i));
		}

	}

}
