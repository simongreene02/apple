package activity2;

import java.util.Scanner;

public class PizzaProjectV2{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the Set Size?");
		int s = scanner.nextInt();
		System.out.println("What is the Subset Size?");
		int k = scanner.nextInt();
		System.out.println(factorial(s) / (factorial(k) * factorial(s-k)));
	}
	public static int factorial(int input) {
		if (input == 0) {
			return 1;
		} 
		return input * factorial(input-1);
	}

}