package Exercises;

import java.util.Scanner;

public class Journey {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double budget = Double.parseDouble(scan.nextLine());
		String season = scan.nextLine();

		double price = 0.00;
		String place = null;

		if (budget <= 100) {
			if (season.equals("summer")) {
				price = budget * 0.3;
				place = "Camp";
			} else if (season.equals("winter")) {
				price = budget * 0.7;
				place = "Hotel";
			}
			System.out.println("Somewhere in Bulgaria");
			System.out.printf("%s - %.2f", place, price );
		} else if (budget <= 1000) {

			if (season.equals("summer")) {
				price = budget * 0.4;
				place = "Camp";
			} else if (season.equals("winter")) {
				price = budget * 0.8;
				place = "Hotel";
			}
			System.out.println("Somewhere in Balkans");
			System.out.printf("%s - %.2f", place, price );

		} else if (budget > 1000) {
			{
				price = budget * 0.9;
				if(season.equals("summer")) {
					place = "Hotel";
				}else if(season.equals("winter")) {
					place = "Hotel";
				}
				System.out.println("Somewhere in Europe");
				System.out.printf("%s - %.2f", place, price );
			}
		}

	}
}
