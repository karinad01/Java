package exercise;

import java.util.Scanner;

public class ExamPreparation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int poorGradesLimit = Integer.parseInt(scan.nextLine());

		String problemName = scan.nextLine();

		int count = 0;
		boolean isFailed = false;

		double allGradesSum = 0.0;
		int allGrades = 0;
		String lastProblem = "";

		while (!problemName.equals("Enough")) {
			int grade = Integer.parseInt(scan.nextLine());
			allGrades++;
			allGradesSum += grade;

			if (grade <= 4) {
				count++;
				if (count == poorGradesLimit) {
					lastProblem = problemName;
					isFailed = true;
					break;

				}
			}
			lastProblem = problemName;
			problemName = scan.nextLine();
		}
		double averageScore = allGradesSum / allGrades;

		String output = "";
		if (isFailed) {
			output = String.format("You need a break, %d poor grades.", count);
		} else {
			output = String.format("Average score: %.2f%n" + "Number of problems: %d%n" + "Last problem: %s",
					averageScore, allGrades, lastProblem);
		}
		System.out.println(output);
	}

}
