package unit5.lesson5;

public class Student {
	private static int numStudents = 0;
	private String firstName;
	private String lastName;
	private int gradeLevel;
	private double gpa;
	private int id;
	
	public Student(String firstName, String lastName, int gradeLevel, double gpa) {
		this.firstName = firstName;
		this.lastName = lastName;
		if (gradeLevel >= 0 && gradeLevel <= 12) {
		this.gradeLevel = gradeLevel;
		} else {
			this.gradeLevel = 0;
		}
		if (gpa >= 0 && gpa <= 4.5) {
			this.gpa = gpa;
			} else {
				this.gpa = 0;
			}
		id = ++numStudents;
	}
	public Student() {
		this("None", "None", 0, 0.0);
	}
	public String toString() {
		return lastName + ", " + firstName + "\nGPA: " + gpa + "\nGrade Level: " + gradeLevel + " id # " + id;
	}
}
