package unit3.assignment6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
/**
 Assignment 6 - Merge Arrays

In this lab, you will be creating a program that merges two arrays of non-negative (equal to or greater than 0) 
integers. Your program will accept each array as input from the keyboard. You do not know ahead of time how many values
 will be entered, but you can assume each array will have a maximum length of 10,000 elements. To stop entering values 
 enter a negative number. You may disregard any negative numbers input and not store these in the array.
The elements of the two input arrays should be in increasing order. In other words, each array element must have a 
value that is greater than or equal to the previous element value. An array may contain repeated elements.


After the two arrays have been input, your program must check to make sure the elements of each array have been entered
in order. If an out of order element is found, print the message “ERROR: Array not in correct order”.

Your task is to merge the two input arrays into a new array, with all elements in order, lowest to highest. Print out 
each of the original arrays entered, followed by the merged array.
Please note that your program must output the arrays with exactly one space between each of the numbers.
Sample Run 1:
Enter the values for the first array, up to 10000 values, enter a negative number to quit
3
3
5
6
8
9
-1

Enter the values for the second array, up to 10000 values, enter a negative number to quit
3
4
5
6
-5

First Array: 
3 3 5 6 8 9 

Second Array: 
3 4 5 6 

Merged Array:
3 3 3 4 5 5 6 6 8 9
Sample Run 2:
Enter the values for the first array, up to 10000 values, enter a negative number to quit
4
5
7
2
-1

Enter the values for the second array, up to 10000 values, enter a negative number to quit
3
3
3
3
3
3
-100


First Array: 
4 5 7 2 

Second Array: 
3 3 3 3 3 3 

ERROR: Array not in correct order
 */

public class Main {

	public static void main(String[] args) {
		int[] arrayOne = new int[10000];
		int[] arrayTwo = new int[10000];
		int[] arrayOut = new int[arrayOne.length + arrayTwo.length];
		int arrayOneLength = 0;
		int arrayTwoLength = 0;
		int arrayOutLength = 0;
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
		System.out.println(arrayOneLength);
		System.out.println(arrayTwoLength);
		
		
		
		
		
		
		
		
		
//		boolean isSorted = false;
//		while (!isSorted) {
//			isSorted = true;
//			for (int i = 0; i < arrayOut.length - 1; i++) {
//				if (arrayOut[i+1] < arrayOut[i]) {
//					isSorted = false;
//					input = arrayOut.get(i);
//					arrayOut.add(i-1, arrayOut.get(i+1));
//					arrayOut.remove(i+2);
//				}
//			}
//			for (int i = 1; i < arrayOut.length; i++) {
//				if (arrayOut.get(i-1) > arrayOut.get(i)) {
//					isSorted = false;
//					input = arrayOut.get(i);
//					arrayOut.add(i+1, arrayOut.get(i-1));
//					arrayOut.remove(i-1);
//				}
//			}
//		}
//		System.out.println("");
//		System.out.println("Merged Array:");
//		for (int i : arrayOut) {
//			System.out.print(i);
//			System.out.print(" ");
//		}
		

	}

}
