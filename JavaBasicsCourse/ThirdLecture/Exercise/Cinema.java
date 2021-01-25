package Exercises;
import java.util.Scanner;
public class Cinema {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String projectionType = scan.nextLine();
		int rows = Integer.parseInt(scan.nextLine());
		int columns = Integer.parseInt(scan.nextLine());
		
		if(projectionType.equals("Premiere")) {
			double income = rows*columns*12;
			System.out.printf("%.2f",income);
		}else if(projectionType.equals("Normal")) {
			double income = rows*columns*7.5;
			System.out.printf("%.2f",income);
		}else if(projectionType.equals("Discount")) {
			double income = rows*columns*5;
			System.out.printf("%.2f", income);
		}
		
	}

}
