import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		String grade;
		float pct;
		double gpa;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter percentage: ");
		pct = s.nextFloat();

		if (pct < 60) {
			grade = "F";
			gpa = 0.0;
		} else if (pct < 70) {
			grade = "D";
			gpa = 1.0;
		} else if (pct < 77) {
			grade = "C";
			gpa = 2.0;
		} else if (pct < 80) {
			grade = "C+";
			gpa = 2.33;
		} else if (pct < 83) {
			grade = "B-";
			gpa = 2.67;
		} else if (pct < 87) {
			grade = "B";
			gpa = 3.0;
		} else if (pct < 90) {
			grade = "B+";
			gpa = 3.33;
		} else if (pct < 93) {
			grade = "A-";
			gpa = 3.67;
		} else {
			grade = "A";
			gpa = 4.0;
		}

		System.out.println("Percentag: " + pct);
		System.out.println("Grade: " + grade);
		System.out.println("GPA: " + gpa);
	}

}
