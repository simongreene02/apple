package unit4.assignment7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a base ten number between 0 and 255, inclusive.");
		int inputOne = -1;
		while (inputOne < 0 || inputOne > 255) {
			inputOne = scanner.nextInt();
		}
		System.out.println("Enter a base ten number between 0 and 255, inclusive.");
		int inputTwo = -1;
		while (inputTwo < 0 || inputTwo > 255) {
			inputTwo = scanner.nextInt();
		}
		System.out.println("First binary number:");
		printBin(convertToBinary(inputOne));
		System.out.println();
		System.out.println("Second binary number:");
		printBin(convertToBinary(inputTwo));
		System.out.println();
		System.out.println("Added:");
		printBin(addBin(convertToBinary(inputOne), convertToBinary(inputTwo)));
	}
	
	static int[] convertToBinary(int b) {
		int[] arrayOut = new int[8];
		while (b > 0) {
			int power = 0;
			while ((Math.pow(2, (power+1))) <= b) {
				power++;
			}
			arrayOut[(arrayOut.length-1)-power] = 1;
			b -= Math.pow(2, power);
		}
		return arrayOut;
	}
	
	private static void printBin(int [] arr) {
		for (int i:arr){
			System.out.print(i + " ");
		}	
	}
	
	private static int[] addBin(int a[], int b[]) {
		int[] arrayOut = new int[a.length];
		int carrying = 0;
		for (int i = arrayOut.length - 1; i >= 0; i--) {
			if (a[i] + b[i] + carrying == 0) {
				carrying = 0;
				arrayOut[i] = 0;
			} else if (a[i] + b[i] + carrying == 1) {
				carrying = 0;
				arrayOut[i] = 1;
			} else if (a[i] + b[i] + carrying == 2) {
				carrying = 1;
				arrayOut[i] = 0;
			} else if (a[i] + b[i] + carrying == 3) {
				carrying = 1;
				arrayOut[i] = 1;
			}
		}
		if (carrying == 1) {
			System.out.println("Error: overflow");
		}
		return arrayOut;
	}

}
