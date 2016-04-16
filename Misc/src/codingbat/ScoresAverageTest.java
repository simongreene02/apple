package codingbat;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ScoresAverageTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test1() {
		assertEquals(4, ScoresAverage.scoresAverage(new int[]{2, 2, 4, 4}));
	}
	
	@Test
	public void test2() {
		assertEquals(4, ScoresAverage.scoresAverage(new int[]{4, 4, 4, 2, 2, 2}));
	}
	
	@Test
	public void test3() {
		assertEquals(4, ScoresAverage.scoresAverage(new int[]{3, 4, 5, 1, 2, 3}));
	}
	
	@Test
	public void test4() {
		assertEquals(6, ScoresAverage.scoresAverage(new int[]{5, 6}));
	}
	
	@Test
	public void test5() {
		assertEquals(5, ScoresAverage.scoresAverage(new int[]{5, 4}));
	}
	
	@Test
	public void test6() {
		assertEquals(5, ScoresAverage.scoresAverage(new int[]{5, 4, 5, 6, 2, 1, 2, 3}));
	}

}
