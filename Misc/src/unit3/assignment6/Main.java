package unit3.assignment6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] arrayOne = new int[10000];
		int[] arrayTwo = new int[10000];
		int arrayOneLength = 0;
		int arrayTwoLength = 0;
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		System.out.println("Enter the values for the first array, up to 10000 values, enter a negative number to quit");
		while (arrayOneLength < arrayOne.length && input > -1) {
			input = scanner.nextInt();
			if (input > -1) {
				arrayOne[arrayOneLength++] = input;
			}
		}
		input = 0;
		System.out.println("Enter the values for the second array, up to 10000 values, enter a negative number to quit");
		while (arrayTwoLength < arrayTwo.length && input > -1) {
			input = scanner.nextInt();
			if (input > -1) {
				arrayTwo[arrayTwoLength++] = input;
			}
		}
		System.out.println("First Array: ");
		for (int i = 0; i < arrayOneLength; i++) {
			System.out.print(arrayOne[i]);
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("Second Array: ");
		for (int i = 0; i < arrayTwoLength; i++) {
			System.out.print(arrayTwo[i]);
			System.out.print(" ");
		}
		System.out.println();
		for (int i = 0; i < arrayOneLength - 1; i++) {
			if (arrayOne[i+1] < arrayOne[i]) {
				System.out.println("ERROR: Array not in correct order");
				return;
			}
		}
		for (int i = 0; i < arrayTwoLength - 1; i++) {
			if (arrayTwo[i+1] < arrayTwo[i]) {
				System.out.println("ERROR: Array not in correct order");
				return;
			}
		}
		int index = 0;
		int pointerOne = 0;
		int pointerTwo = 0;
		int[] arrayOut = new int[arrayOne.length + arrayTwo.length];
		for (int arrayOutLength = 0; arrayOutLength < arrayOneLength + arrayTwoLength; arrayOutLength++) {
			if (pointerOne >= arrayOneLength && pointerTwo >= arrayTwoLength) {
				throw new IllegalStateException();
			}
			else if (pointerOne >= arrayOneLength && pointerTwo < arrayTwoLength) {
				arrayOut[arrayOutLength] = arrayTwo[pointerTwo++];
			}
			else if (pointerTwo >= arrayTwoLength && pointerOne < arrayOneLength) {
				arrayOut[arrayOutLength] = arrayOne[pointerOne++];
			}
			else if (arrayOne[pointerOne] <= arrayTwo[pointerTwo]) {
				arrayOut[arrayOutLength] = arrayOne[pointerOne++];
			}
			else {
				arrayOut[arrayOutLength] = arrayTwo[pointerTwo++];
			}
		}
	
		System.out.println("Merged Array: ");
		for (int i = 0; i < arrayOneLength + arrayTwoLength; i++) {
			System.out.print(arrayOut[i]);
			System.out.print(" ");
		}
	}
	
	
}
