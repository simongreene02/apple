package practice.exam4;

import java.util.List;

public class APStudent {
	private List<Exam> exams;
	public int getAwardLevel() {
		int passingExams = 0;
		double examAverage = 0;
		for (Exam exam : exams) {
			examAverage += exam.getGrade();
			if (exam.getGrade() >= 3) {
				passingExams++;
			}
		}
		examAverage = examAverage / exams.size();
		if (passingExams == 3) {
			return 1;
		} else if (passingExams > 3 && examAverage < 3.25) {
			return 1;
		} else if (passingExams == 4) {
			return 2;
		} else if (passingExams == 5) {
			return 3;
		} else {
			return 0;
		}
	}
	public static double[] getStats(List<APStudent> students) {
		int noAwardStudents = 0;
		int scholarAwardStudents = 0;
		int honorsAwardStudents = 0;
		int distinctionAwardStudents = 0;
		for (APStudent student : students) {
			if (student.getAwardLevel() == 0) {
				noAwardStudents++;
			} else if (student.getAwardLevel() == 1) {
				scholarAwardStudents++;
			} else if (student.getAwardLevel() == 2) {
				honorsAwardStudents++;
			} else if (student.getAwardLevel() == 3) {
				distinctionAwardStudents++;
			}
		}
		double[] outList = new double[4];
		outList[0] = noAwardStudents / students.size() * 100.0;
		outList[1] = scholarAwardStudents / students.size() * 100.0;
		outList[2] = honorsAwardStudents / students.size() * 100.0;
		outList[3] = distinctionAwardStudents / students.size() * 100.0;
		return outList;
	}
}
