package unit5.lesson2.activity1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter words, enter STOP to stop the loop.");
		String input = scanner.next();
		ArrayList<String> outputList = new ArrayList<String>();
		while (!input.equals("STOP")) {
			outputList.add(input);
			input = scanner.next();
		}
		for (String word : outputList) {
			if (word.contains("a")) {
				System.out.println(word);
			}
		}
	}

}
