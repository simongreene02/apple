package unit5.lesson4;

public class Vehicle {
	private int location;

	public Vehicle(int loc) {
		if (loc >= -20 && loc <= 20) {
			location = loc;
		} else {
			loc = 0;
		}
	}

	public Vehicle() {
		this(0);
	}
	
	void forward() {
		if (location < 20) {
			location++;
		}
	}
	
	void backward() {
		if (location > -20) {
			location--;
		}
	}

	int getLocation() {
		return location;
	}
	
	public String toString() {
		String outputString = "";
		for (int i = 0; i < location + 20; i++) {
			outputString += " ";
		}
		outputString += "@";
		for (int i = 0; i < 20 - location; i++) {
			outputString += " ";
		}
		return outputString;
	}
}
