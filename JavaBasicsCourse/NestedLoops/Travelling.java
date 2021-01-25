import java.util.Scanner;

public class Travelling {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String destination = scan.nextLine();
		

		while (!destination.equals("End")) {
			double minBudget = Double.parseDouble(scan.nextLine());
			double saved = 0.0;

			while(minBudget>saved) {
			 double sum = Double.parseDouble(scan.nextLine());
			   saved += sum;

	
			}
			System.out.printf("Going to %s!%n", destination);
			destination = scan.nextLine();
		}

	}
}