package unit4.lesson32;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Lesson_32_Activity_TwoTest {

	@Test
	public void monthName_validMonth_may() {
		assertEquals(31, Lesson_32_Activity_Two.trueMonthDays(5));
	}

	@Test(expected = IllegalArgumentException.class)
	public void monthName_invalidMonthTooSmall_error() {
		Lesson_32_Activity_Two.trueMonthDays(0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void monthName_invalidMonthTooLarge_error() {
		Lesson_32_Activity_Two.trueMonthDays(13);
	}

}
