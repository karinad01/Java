package lab;

import java.util.Scanner;

public class leftAndRightSum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int leftSum = 0;
		int rightSum = 0;

		for (int i = 1; i <= n; i++) {
			leftSum = leftSum + scan.nextInt();
		}

		for (int i = 1; i <= n; i++) {
			rightSum = rightSum + scan.nextInt();
		}

		if (leftSum == rightSum) {
			System.out.println("Yes, sum = " + leftSum);
		} else {
			int diff = Math.abs(leftSum - rightSum);
			System.out.println("No, diff = " + diff);
		}

	}

}
