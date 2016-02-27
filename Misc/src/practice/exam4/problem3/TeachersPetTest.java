package practice.exam4.problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TeachersPetTest {

	private TeachersPet bot;
	@Before
	public void setUp() {
		bot = new TeachersPet("Not Simon");
	}

	@Test
	public void respondToGreeting_morning() {
		assertEquals("Good morning.\nWhat are we going to do in class today?",
				bot.respondToGreeting("Good morning"));
	}
	@Test
	public void respondToGreeting_afternoon() {
		assertEquals("Good afternoon Mr. Fog.\nWhat are we going to do in class today?",
				bot.respondToGreeting("Very cold this afternoon. My name is Mr. Fog."));
	}
	@Test
	public void respondToGreeting_hello() {
		assertEquals("Hello Mr. Blake.\nWhat are we going to do in class today?",
				bot.respondToGreeting("My name is Mr. Blake."));
	}
}
