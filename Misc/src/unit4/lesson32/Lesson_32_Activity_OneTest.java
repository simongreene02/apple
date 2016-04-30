package unit4.lesson32;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Lesson_32_Activity_OneTest {

	@Test
	public void monthName_validMonth_may() {
		assertEquals("May", Lesson_32_Activity_One.trueMonthName(5));
	}

	@Test(expected = IllegalArgumentException.class)
	public void monthName_invalidMonthTooSmall_error() {
		Lesson_32_Activity_One.trueMonthName(0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void monthName_invalidMonthTooLarge_error() {
		Lesson_32_Activity_One.trueMonthName(13);
	}

}
