package practice.exam4.problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StudentBotTest {
	private StudentBot bot;
	@Before
	public void setUp() {
		bot = new StudentBot("Not Simon");
	}

	@Test
	public void respondToGreeting_morning() {
		assertEquals("Good morning", bot.respondToGreeting("Good morning"));
	}
	@Test
	public void respondToGreeting_afternoon() {
		assertEquals("Good afternoon",
				bot.respondToGreeting("Very cold this afternoon. My name in Mr. Fog."));
	}
	@Test
	public void respondToGreeting_hello() {
		assertEquals("Hello", bot.respondToGreeting("My name is Mr. Blake."));
	}

}
