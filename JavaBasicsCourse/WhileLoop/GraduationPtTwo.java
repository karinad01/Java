import java.util.Scanner;

public class GraduationPtTwo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		int cls = 1;
		int fails = 0;
		double totalGrade = 0.0;
		boolean isFailedMoreThanOnce = false;

		while (cls <= 12) {
			double grade = Double.parseDouble(scan.nextLine());
			if (grade >= 4.00) {
				totalGrade += grade;
				cls++;
				continue;
			}
			totalGrade += grade;
			fails++;

			if (fails > 1) {
				isFailedMoreThanOnce = true;
				break;
			}

			cls++;
		}
		if (isFailedMoreThanOnce) {

			System.out.printf("%s has been excluded at %d grade", name, cls-1);
		}else {
			double averageGrade = totalGrade/12;
			System.out.printf("%s graduated. Average grade: %.2f", name,averageGrade);
		}

	}

}
