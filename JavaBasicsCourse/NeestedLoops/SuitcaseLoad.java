import java.util.Scanner;

public class SuitcaseLoad {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double capacity = Double.parseDouble(scan.nextLine());
		String input = scan.nextLine();

		int counter = 0;
		double volume =0;
		while (!input.equals("End")) {
		
			volume = Double.parseDouble(input);

			if (counter % 2 == 0 && counter !=0) {
				volume = volume + 0.1 * volume;
			}

			if (capacity < volume) {
				System.out.println("No more space!");
				break;
			}
			capacity -= volume;
			counter++;

			input = scan.nextLine();

		}

		
		if (input.equals("End")) {
			System.out.println("Congratulations! All suitcases are loaded!");

		}
		System.out.printf("Statistic: %d suitcases loaded.", counter);
	}

}
