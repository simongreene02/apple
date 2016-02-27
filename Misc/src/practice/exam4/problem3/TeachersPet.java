package practice.exam4.problem3;

public class TeachersPet extends StudentBot {
	public TeachersPet(String name) {
		super(name);
	}

	@Override
	public String respondToGreeting(String greeting) {
		String output = super.respondToGreeting(greeting);
		if (greeting.contains("name is")) {
			output += greeting.substring(greeting.indexOf("name is") + 7);
		} else {
			output += '.';
		}
		output += "\nWhat are we going to do in class today?";
		return output;
	}
}
