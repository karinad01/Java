package Exercise;

import java.util.Scanner;

public class NumberPyramid {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = Integer.parseInt(scan.nextLine());
		int number = 1;
		boolean isGreater = false;
		for (int rows = 1; rows <= n; rows++) {
			for (int cols = 1; cols <= rows; cols++) {
				System.out.print(number + " ");
				number++;
				if (number > n) {
					isGreater = true;
					break;
				}
			}
				if (isGreater) {
					break;
				}
			
			System.out.println();
		}

	}
}