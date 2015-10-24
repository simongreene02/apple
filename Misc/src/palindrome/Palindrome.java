package palindrome;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		String input = new Scanner(System.in).nextLine();
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
		System.out.println(output.equalsIgnoreCase(input));
	}
}
