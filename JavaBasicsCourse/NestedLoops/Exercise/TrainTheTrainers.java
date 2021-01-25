package Exercise;

import java.util.Scanner;

public class TrainTheTrainers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = Integer.parseInt(scan.nextLine());

		double totalGradesSum = 0.0;
		int presentationCount = 0;
		String name = scan.nextLine();
		while (!name.equals("Finish")) {
			String presentation = name;
			presentationCount++;
			double averageGrade = 0;
			double sumGrades = 0;

			for (int i = 1; i <= n; i++) {
				double grade = Double.parseDouble(scan.nextLine());
				sumGrades += grade;
			}
			
			averageGrade = sumGrades/n;
			totalGradesSum += averageGrade;
			System.out.printf("%s - %.2f.%n", presentation, averageGrade);
			
			name = scan.nextLine();
		}
		
		System.out.printf("Student's final assessment is %.2f.", totalGradesSum / presentationCount);

	}

}
