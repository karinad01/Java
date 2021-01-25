package Exercise;

import java.util.Scanner;

public class EqualsSumEvenOddPosition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n1 = Integer.parseInt(scan.nextLine());
		int n2 = Integer.parseInt(scan.nextLine());

		for (int i = n1; i <= n2; i++) {
			int number = i;
			int oddSum = 0;
			int evenSum = 0;
			for (int j = 6; j > 0; j--) {
				int digit = number % 10;
				number /= 10;

				if (j % 2 == 0) {
					evenSum += digit;
				} else {
					oddSum += digit;
				}
			}
			if (oddSum == evenSum) {
				System.out.print(i + " ");
			}
		}
	}
}
