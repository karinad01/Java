package exercises.first;
import java.util.Scanner;


public class RadiansToDegrees {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double angleInRadians = Double.parseDouble(scan.nextLine());
		
		double angleInDegrees = angleInRadians * (180 / Math.PI);
		System.out.printf("%.0f", angleInDegrees);
		
	}

}


//import java.util.Scanner;
//
//
//public class RadiansToDegrees {
//
//	public static void main(String[] args) {
//		
//		Scanner scan = new Scanner(System.in);
//		double angleInRadians = Double.parseDouble(scan.nextLine());
//		
//		double angleInDegrees = Math.toDegrees(angleInRadians);
//		System.out.printf("%.0f", angleInDegrees);
//		
//	}
//
//}