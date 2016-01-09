package unit3.assignment5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final char[] VALID_CHARACTERS = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
				'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
				'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '\t',
				'*' };
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first String:");
		String firstInput = scanner.nextLine();
		System.out.println("Enter the replacement String:");
		String secondInput = scanner.nextLine();
		boolean hasTriggeredError = false;
		boolean isValidCharacter = false;
		for (int i = 0; i < firstInput.length(); i++) {
			isValidCharacter = false;
			for (char j : VALID_CHARACTERS) {
				if (firstInput.charAt(i) == j) {
					isValidCharacter = true;
				}
			}
			if (!isValidCharacter) {
				hasTriggeredError = true;
			}
		}
		if (!firstInput.contains("*")) {
			System.out.println("Error: no *");
		} else if (hasTriggeredError || firstInput.indexOf("*") != firstInput.lastIndexOf("*")) {
			System.out.println("Error: Incorrect characters");
			System.out.println(firstInput.indexOf("*"));
			System.out.println(firstInput.lastIndexOf("*"));
			System.out.println(hasTriggeredError);
		} else {
			System.out.println(firstInput.replace("*", secondInput));
		}

	}

}
