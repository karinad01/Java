package lab;

import java.util.Scanner;

public class oddEvenSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int even = 0;
		int odd = 0;

		for (int i = 1; i <= n; i++) {
			int element = Integer.parseInt(scan.nextLine());
			
			if(i%2 == 0) {
				even += element;
			}else {
				odd += element;
			}
		}

		
		if (even == odd) {
			System.out.println("Yes");
			System.out.println("Sum = " + even);
		} else {
			System.out.println("No");
			int diff = Math.abs(even - odd);
			System.out.println("Diff = " + diff);
		}
	}

}
