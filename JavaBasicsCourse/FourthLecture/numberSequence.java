package lab;
import java.util.Scanner;
public class numberSequence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 1; i <=n; i++) {
			int num = Integer.parseInt(scan.nextLine());
			
			if(num>max) {
				max=num;
			}if(num<min) {
				min = num;
			}
			
		}
		System.out.printf("Max number: " + max);
		System.out.printf("\nMin number: " + min);
	}

}
