package practice.exam4;

import static org.junit.Assert.*;

import org.junit.Test;

public class TablesScheduleTest {

	@Test
	public void test() {
		new TablesSchedule(5);
	}
	
	@Test
	public void testReserve() {
		TablesSchedule tablesSchedule = new TablesSchedule(5);
		tablesSchedule.reserve(3, 5);
		assertEquals(".....xxx....", tablesSchedule.getSchedules(3));
	}
	
	@Test
	public void testOccupiedSlots() {
		TablesSchedule tablesSchedule = new TablesSchedule(5);
		tablesSchedule.reserve(3, 5);
		assertEquals(3, tablesSchedule.occupiedSlots(3));
	}
	
	@Test
	public void testOccupiedSlots2() {
		TablesSchedule tablesSchedule = new TablesSchedule(5);
		tablesSchedule.reserve(3, 5);
		tablesSchedule.reserve(3, 1);
		assertEquals(6, tablesSchedule.occupiedSlots(3));
	}
	
	@Test
	public void testFindTable_firstTable() {
		TablesSchedule tablesSchedule = new TablesSchedule(5);
		tablesSchedule.reserve(3, 5);
		assertEquals(1, tablesSchedule.findTable(7));
	}
	@Test
	public void testFindTable_bestTable() {
		TablesSchedule tablesSchedule = new TablesSchedule(5);
		tablesSchedule.reserve(3, 5);
		assertEquals(3, tablesSchedule.findTable(8));
	}

}
