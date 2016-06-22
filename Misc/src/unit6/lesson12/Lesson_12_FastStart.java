package unit6.lesson12;

import java.util.ArrayList;

public class Lesson_12_FastStart {

	public static void main(String[] args) {
		ArrayList<String> outputList = new ArrayList<String>();
		outputList.add("A");
		outputList.add("B");
		outputList.add("C");
		outputList.add("D");
		outputList.add("E");
		outputList.add("F");
		outputList.add("G");
		outputList.add("H");
		outputList.add("I");
		outputList.add("J");
		int string1 = (int) (Math.random() * 10);
		int string2 = (int) (Math.random() * 10);
		while (string2 == string1) {
			string2 = (int) (Math.random() * 10);
		}
		
		System.out.println(outputList.get(string1));
		System.out.println(outputList.get(string2));
	}

}
