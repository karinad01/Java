import java.util.Scanner;

public class Zadacha6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int aviocompanies = Integer.parseInt(scan.nextLine());
		String best = "";
		int bestSum = -1;
		
		for (int i = 0; i < aviocompanies; i++) {
			String companyName = scan.nextLine();
			int sum = 0;
			int counter = 0;
			String command = scan.nextLine();
			
			while (!command.equals("Finish")) {
				sum += Integer.parseInt(command);
				counter++;
				command = scan.nextLine();
			}
			int passengers = sum/counter;
			System.out.printf("%s: %d passengers.%n", companyName, passengers);
		
			if(passengers>bestSum) {
				best = companyName;
				bestSum = passengers;
			}
		}
		System.out.printf("%s has most passengers per flight: %d", best,bestSum);
	}

}
