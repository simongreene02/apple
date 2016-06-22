package unit1.assignment1;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class MainTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void averageTest_singleNumber() {
		assertEquals(1.0, Main.average(1), 0);
	}
	
	@Test
	public void averageTest_multipleNumbers() {
		assertEquals(1.0, Main.average(0, 2), 0);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void averageTest_noNumbers() {
		Main.average();
	}
	
	@Test
	public void findTestWeight() {
		Scanner scanner = new Scanner("80\n70");
		assertEquals(37.5, Main.findTestWeight(scanner), 0);
	}
	
	@Test
	public void findQuizWeight() {
		Scanner scanner = new Scanner("80\n70\n60");
		assertEquals(21, Main.findQuizWeight(scanner), 0);
	}
	
	@Test
	public void findHomeworkWeight() {
		Scanner scanner = new Scanner("80");
		assertEquals(16, Main.findHomeworkWeight(scanner), 0);
	}
	
//	Please enter your test grades.
//	Test 1: 89
//	Test 2: 86
//
//	Please enter your quiz grades.
//	Quiz 1: 84
//	Quiz 2: 84
//	Quiz 3: 83
//
//	Please enter your homework average.
//	Homework: 90.12
//
//	Test Average: 87.5
//	Quiz Average: 83.66666666666667
//	Final Grade: 86.874
	
	@Test
	public void findTestWeight_example() {
		Scanner scanner = new Scanner("89\n86");
		assertEquals(43.75, Main.findTestWeight(scanner), 0);
	}
	
	@Test
	public void findQuizWeight_example() {
		Scanner scanner = new Scanner("84\n84\n83");
		assertEquals(25.1, Main.findQuizWeight(scanner), 0);
	}
	
	@Test
	public void findHomeworkWeight_example() {
		Scanner scanner = new Scanner("90.12");
		assertEquals(18.024, Main.findHomeworkWeight(scanner), 0);
	}
}
