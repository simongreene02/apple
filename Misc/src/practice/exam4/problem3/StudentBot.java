package practice.exam4.problem3;

public class StudentBot extends ChatBot {
	
	public StudentBot(String name) {
		super(name);
	}

	@Override
	public String respondToGreeting(String greeting) {
		if (greeting.toLowerCase().contains("morning")) {
			return "Good morning";
		}
		if (greeting.toLowerCase().contains("afternoon")) {
			return "Good afternoon";
		}
		return "Hello";
	}
	

}
