package exercise;

import java.util.Scanner;

public class PuppyCare {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int totalFoodInKg = Integer.parseInt(scan.nextLine());

		int totalFoodInGr = totalFoodInKg * 1000;

		String input = scan.nextLine();
		while (!input.equals("Adopted")) {
			int eatenFood = Integer.parseInt(input);

			totalFoodInGr -= eatenFood;
			
			input = scan.nextLine();
		}

		
		String output = "";
		if(totalFoodInGr >= 0) {
			output = String.format("Food is enough! Leftovers: %d grams.",totalFoodInGr );
		}else {
			output = String.format("Food is not enough. You need %d grams more.", Math.abs(totalFoodInGr));
		}
		
		System.out.println(output);
	}

}
