package lab;
import java.util.Scanner;
public class sumNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numbers = Integer.parseInt(scan.nextLine());
		int sum = 0;
		
		for (int i = 0; i < numbers; i++) {
			 int num = Integer.parseInt(scan.nextLine());
			 sum += num;
		}
		System.out.println(sum);
		

	}

}
