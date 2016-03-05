package practice.exam4.problem3;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class ChatBotTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGreetAll() {
		ArrayList<ChatBot> bots = new ArrayList<ChatBot>();
		bots.add(new StudentBot("SdudentBot 1"));
		bots.add(new TeachersPet("TeachersPet 1"));
		bots.add(new StudentBot("Sdudent 2"));
		bots.add(new TeachersPet("TeachersPet 2"));
		ByteArrayInputStream bais = new ByteArrayInputStream("Hello, my name is Joji.".getBytes());
		System.setIn(bais);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream printStream = new PrintStream(baos);
		PrintStream originalOut = System.out;
		System.setOut(printStream);
		ChatBot.greetAll(bots);
		printStream.flush();
		printStream.close();
		System.setOut(originalOut);
		System.out.println(new String(baos.toByteArray()));
	}

}
