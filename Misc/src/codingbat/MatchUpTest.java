package codingbat;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MatchUpTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test(expected = IllegalArgumentException.class)
	public void matchUp_differentArraySize_error() {
		String[] a = new String[4];
		String[] b = new String[5];
		MatchUp.matchUp(a, b);
	}
	
	@Test
	public void matchUp_sameArraySize_3() {
		String[] a = new String[]{"apple", "orange", "bananna", "grape", "strawberry"};
		String[] b = new String[]{"aligator", "ox", "dog", "cat", "sheep"};
		assertEquals(3, MatchUp.matchUp(a, b));
	}
	
	@Test
	public void matchUp_sameArraySizeWithEmptyStrings_3() {
		String[] a = new String[]{"apple", "orange", "bananna", "", "strawberry"};
		String[] b = new String[]{"aligator", "ox", "", "cat", "sheep"};
		assertEquals(3, MatchUp.matchUp(a, b));
	}

}
