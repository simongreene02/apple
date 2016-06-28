package unit5.assignment2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LightTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void equality() {
		assertEquals(new Light(), new Light(true, false, "white"));
	}
	
	@Test
	public void equality_turnedOffNotBurntOutBlue() {
		Light actualLight = new Light(false, false, "blue");
		Light expectedLight = new Light(false, false, "blue");
		assertEquals(expectedLight, actualLight);
	}
	
	@Test
	public void constructor() {
		Light light = new Light(false, false, "blue");
		assertFalse(light.isOn());
		assertFalse(light.isBurntOut());
		assertEquals("blue", light.getColor());
	}
	
	@Test
	public void testFlip_lightActivated() {
		Light light = new Light(true, false, "blue");
		assertTrue(light.isOn());
		light.flip();
		assertFalse(light.isOn());
		light.flip();
		assertTrue(light.isOn());
	}
	
	@Test
	public void testBurnOut_lightBurntOut() {
		Light light = new Light(true, true, "blue");
		assertFalse(light.isOn());
		light = new Light(true, false, "blue");
		light.burnOut();
		assertTrue(light.isBurntOut());
		assertFalse(light.isOn());
		light.flip();
		assertFalse(light.isOn());
	}
	
	@Test
	public void testColorMethods() {
		Light light = new Light(true, false, "ReD");
		assertEquals(light.getColor(), "red");
		light = new Light(true, false, "GrEeN");
		assertEquals(light.getColor(), "green");
		light = new Light(true, false, "BlUe");
		assertEquals(light.getColor(), "blue");
		light = new Light(true, false, " ");
		assertEquals(light.getColor(), "white");
	}
	
	@Test
	public void testToString() {
		Light light = new Light(true, true, "red");
		assertEquals("off red\tburnt out", light.toString());
		light = new Light(true, false, "red");
		assertEquals("on red\tnot burnt out", light.toString());
		light = new Light(false, true, "red");
		assertEquals("off red\tburnt out", light.toString());
		light = new Light(false, false, "red");
		assertEquals("off red\tnot burnt out", light.toString());
		light = new Light(true, true, "green");
		assertEquals("off green\tburnt out", light.toString());
		light = new Light(true, false, "blue");
		assertEquals("on blue\tnot burnt out", light.toString());
		light = new Light(false, true, "white");
		assertEquals("off white\tburnt out", light.toString());
	}

}
