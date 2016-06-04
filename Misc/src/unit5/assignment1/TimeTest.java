package unit5.assignment1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TimeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTime() {
		assertEquals("1200", new Time().toString());
	}

	@Test
	public void testTimeIntInt_negativeHourPositiveMinute_0010() {
		assertEquals("0010", new Time(-1, 10).toString());
	}
	
	@Test
	public void testTimeIntInt_positiveHourNegativeMinute_1200() {
		assertEquals("1200", new Time(12, -12).toString());
	}
	
	@Test
	public void testTimeIntInt_validInputs_2359() {
		assertEquals("2359", new Time(23, 59).toString());
	}
	
	@Test
	public void testTimeIntInt_bigInputs_0000() {
		assertEquals("0000", new Time(50, 100).toString());
	}

	@Test
	public void testToString_543_0543() {
		assertEquals("0543", new Time(5, 43).toString());
	}
	
	@Test
	public void testToString_53_0503() {
		assertEquals("0503", new Time(5, 3).toString());
	}
	
	@Test
	public void testToString_113_1103() {
		assertEquals("1103", new Time(11, 3).toString());
	}
	
	@Test
	public void testToString_1143_1143() {
		assertEquals("1143", new Time(11, 43).toString());
	}

	@Test
	public void testConvert_543_0543() {
		assertEquals("5:43 am", new Time(5, 43).convert());
	}
	
	@Test
	public void testConvert_53_0503() {
		assertEquals("5:03 am", new Time(5, 3).convert());
	}
	
	@Test
	public void testConvert_113_1103() {
		assertEquals("11:03 am", new Time(11, 3).convert());
	}
	
	@Test
	public void testConvert_1143_1143() {
		assertEquals("11:43 am", new Time(11, 43).convert());
	}
	
	@Test
	public void testConvert_1743_0543() {
		assertEquals("5:43 pm", new Time(17, 43).convert());
	}
	
	@Test
	public void testConvert_173_0503() {
		assertEquals("5:03 pm", new Time(17, 3).convert());
	}
	
	@Test
	public void testConvert_233_1103() {
		assertEquals("11:03 pm", new Time(23, 3).convert());
	}
	
	@Test
	public void testConvert_2343_1143() {
		assertEquals("11:43 pm", new Time(23, 43).convert());
	}
	
	@Test
	public void testConvert_00_1200() {
		assertEquals("12:00 am", new Time(0, 0).convert());
	}
	
	@Test
	public void testConvert_120_1200() {
		assertEquals("12:00 pm", new Time(12, 0).convert());
	}

	@Test
	public void testIncrement_normalIncrement() {
		Time time = new Time(0, 0);
		time.increment();
		assertEquals("0001", time.toString());
	}
	
	@Test
	public void testIncrement_hourIncrement() {
		Time time = new Time(0, 59);
		time.increment();
		assertEquals("0100", time.toString());
	}
	
	@Test
	public void testIncrement_lastHourIncrement() {
		Time time = new Time(23, 59);
		time.increment();
		assertEquals("0000", time.toString());
	}

}
