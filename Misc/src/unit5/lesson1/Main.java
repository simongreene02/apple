package unit5.lesson1;

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
		System.out.println(outputList.size());
		System.out.println(outputList);
		if (outputList.size() > 2) {
			outputList.remove(0);
			outputList.remove(outputList.size() - 1);
			System.out.println(outputList);
		}
	}

}
