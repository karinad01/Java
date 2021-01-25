package exercices;

import java.util.Scanner;

public class OddOrEvenPosition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());

		double oddSum = 0.0;
		double oddMin = Integer.MAX_VALUE;
		double oddMax = Integer.MIN_VALUE;

		double evenSum = 0.0;
		double evenMin = Integer.MAX_VALUE;
		double evenMax = Integer.MIN_VALUE;

		for (int i = 1; i <= n; i++) {
			double number = Double.parseDouble(scan.nextLine());

			// check even position
			if (i % 2 == 0) {
				evenSum += number;

				// check evenMin
				if (number < evenMin) {
					evenMin = number;
				}
				// check evenMax
				if (number > evenMax) {
					evenMax = number;

				}

				// odd position
			} else {
				oddSum += number;
				// check oddMin
				if (number < oddMin) {
					oddMin = number;
				}
				// check oddMax
				if (number > oddMax) {
					oddMax = number;

				}

			}
		}

		if (oddSum == 0) {
			System.out.printf("OddSum=%.2f,%n", oddSum);
			System.out.printf("OddMin=No,%n", oddMin);
			System.out.printf("OddMax=No,%n", oddMax);
		} else {
			System.out.printf("OddSum=%.2f,%n", oddSum);
			System.out.printf("OddMin=%.2f,%n", oddMin);
			System.out.printf("OddMax=%.2f,%n", oddMax);
		}
		
		if (evenSum == 0) {
			System.out.printf("EvenSum=%.2f,%n", evenSum);
			System.out.printf("EvenMin=No,%n", evenMin);
			System.out.printf("EvenMax=No%n", evenMax);
		} else {
			System.out.printf("EvenSum=%.2f,%n", evenSum);
			System.out.printf("EvenMin=%.2f,%n", evenMin);
			System.out.printf("EvenMax=%.2f%n", evenMax);
		}
	}
}
