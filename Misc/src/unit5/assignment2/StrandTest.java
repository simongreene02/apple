package unit5.assignment2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StrandTest {
	
	private Strand strand;
	
	@Before
	public void setUp() {
		strand = new Strand(3);
	}

	@Test
	public void defaultConstructor() {
		assertEquals("on white\tnot burnt out\n", new Strand().toString());
	}
	
	@Test
	public void constructor() {
		
		assertEquals("on white\tnot burnt out\non white\tnot burnt out\non white\tnot burnt out\n", strand.toString());
	}
	
	@Test
	public void setColor() {
		strand.setColor("red");
		assertEquals("on red\tnot burnt out\non red\tnot burnt out\non red\tnot burnt out\n", strand.toString());
	}
	
	@Test
	public void setMulti() {
		strand.setMulti();
		assertEquals("on red\tnot burnt out\non green\tnot burnt out\non blue\tnot burnt out\n", strand.toString());
	}
	
	@Test
	public void turnOff() {
		strand.turnOff();
		assertEquals("off white\tnot burnt out\noff white\tnot burnt out\noff white\tnot burnt out\n", strand.toString());
	}
	
	@Test
	public void turnOn() {
		strand.turnOff();
		strand.turnOn();
		assertEquals("on white\tnot burnt out\non white\tnot burnt out\non white\tnot burnt out\n", strand.toString());
	}
	
	@Test
	public void testBurnOut_numberWithinRange() {
		strand.burnOut(1);
		assertEquals("on white\tnot burnt out\noff white\tburnt out\non white\tnot burnt out\n", strand.toString());
	}
	

}
