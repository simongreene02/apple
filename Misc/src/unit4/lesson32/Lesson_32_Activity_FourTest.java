package unit4.lesson32;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Lesson_32_Activity_FourTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("Hours: 1\nMinutes: 45\nSeconds: 42", Lesson_32_Activity_Four.trueRealTime(6342));
	}

}
