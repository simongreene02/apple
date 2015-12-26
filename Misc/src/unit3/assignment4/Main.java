package unit3.assignment4;

import java.util.Scanner;

public class Main {
	final static int MAXIMUM_LENGTH = 140;
	public static void main(String[] args) {
		System.out.println("Please enter a tweet:");
		String tweet = new Scanner(System.in).nextLine().toLowerCase();
		if (tweet.length() > MAXIMUM_LENGTH) {
			System.out.println("Excess Characters: " + (tweet.length() - MAXIMUM_LENGTH));
		} else {
			System.out.println("Length Correct");
			int hashtags = 0;
			int mentions = 0;
			int links = 0;
			for (int i = 0; i < tweet.length() - 1; i++) {
				if (tweet.charAt(i) == '@' && tweet.charAt(i+1) != ' ' && tweet.charAt(i+1) != '\t') {
					mentions++;
				}
				if (tweet.charAt(i) == '#' && tweet.charAt(i+1) != ' ' && tweet.charAt(i+1) != '\t') {
					hashtags++;
				}
			}
			if (tweet.length() >= 7) {
				for (int i = 0; i < tweet.length() - 6; i++) {
					System.out.println(tweet.substring(i, i + 7));
					if (tweet.substring(i, i + 7).equals("http://")) {
						links++;
					}
				}
			}
			System.out.println("Number of Hashtags: " + hashtags);
			System.out.println("Number of Attributions: " + mentions);
			System.out.println("Number of Links: " + links);
		}
	}
}
