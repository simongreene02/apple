package practice.exam4.problem3;

import java.util.List;
import java.util.Scanner;

public abstract class ChatBot {

	public static String readInput(String prompt) {
			System.out.print(prompt + " ");
			Scanner scanner = new Scanner(System.in);
			return scanner.nextLine();
	}
	
	private String name;
	
	public ChatBot(String nm) {
		name = nm;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract String respondToGreeting(String greeting);
	
	public static void greetAll(List<ChatBot> bots) {
		String input = readInput("Enter greeting:");
		for (ChatBot i : bots) {
			System.out.println(i.name + ": " + i.respondToGreeting(input));
		}
	}
}
