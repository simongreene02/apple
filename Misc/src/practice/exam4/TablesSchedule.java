package practice.exam4;

import java.util.ArrayList;
import java.util.List;

public class TablesSchedule {
	List<String> schedules = new ArrayList<String>();

	public TablesSchedule(int numTables) {
		schedules.add(null);
		for (int i = 1; i <= numTables; i++) {
			schedules.add("............");
		}
	}

	public void reserve(int k, int timeslot) {
		char[] table = schedules.get(k).toCharArray();
		table[timeslot] = 'x';
		table[timeslot + 1] = 'x';
		table[timeslot + 2] = 'x';
		String updatedTable = new String(table);
		schedules.set(k, updatedTable);
	}

	public int occupiedSlots(int k) {
		int reservedSlots = 0;
		for (char i : schedules.get(k).toCharArray()) {
			if (i == 'x') {
				reservedSlots++;
			}
		}
		return reservedSlots;
	}

	public int findTable(int timeSlot) {
		List<Integer> availableTables = new ArrayList();
		for (int i = 1; i < schedules.size(); i++) {
			String table = schedules.get(i);
			if (table.charAt(timeSlot) == '.' && table.charAt(timeSlot + 1) == '.'
					&& table.charAt(timeSlot + 2) == '.') {
				availableTables.add(i);
			}
		}
		if (availableTables.isEmpty()) {
			return 0;
		} 
		if (availableTables.size() == 1) {
			return availableTables.get(0);
		}
		int maxUsedSlots = -1;
		int mostReservedTable = -1;
		for (int tableNumber : availableTables) {
			int userSlots = occupiedSlots(tableNumber);
			if (userSlots > maxUsedSlots) {
				maxUsedSlots = userSlots;
				mostReservedTable = tableNumber;
			}
		}
		return mostReservedTable;
	}

	/**
	 * This method is only for testing
	 * 
	 * @param k
	 * @return
	 */
	String getSchedules(int k) {
		return schedules.get(k);
	}

}
