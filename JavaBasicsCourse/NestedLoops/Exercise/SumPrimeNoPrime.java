package Exercise;

import java.util.Scanner;

public class SumPrimeNoPrime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String input = scan.nextLine();

		int primeSum = 0;
		int nonPrimeSum = 0;

		while (!input.equals("stop")) {
			int num = Integer.parseInt(input);
			boolean isNonPrime = false;

			if (num < 0) {
				System.out.println("Number is negative.");
				input = scan.nextLine();
				continue;
			}
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isNonPrime = true;
					break;
				}

			}

			if(isNonPrime) {
				nonPrimeSum += num;
			}else {
				primeSum += num;
			}
			input = scan.nextLine();
		}
		
		System.out.printf("Sum of all prime numbers is: %d%nSum of all non prime numbers is: %d", primeSum, nonPrimeSum);

	}

}
