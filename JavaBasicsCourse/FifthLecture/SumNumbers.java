import java.util.Scanner;
public class SumNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		int sum = 0;
		
		while(num > sum ) {
			int input = Integer.parseInt(scan.nextLine());
			sum += input;
			
		}
		System.out.println(sum);
	}

}
