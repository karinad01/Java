import java.util.Scanner;
public class Zadacha1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double average = Double.parseDouble(scan.nextLine());
		double litersForKm = Double.parseDouble(scan.nextLine());
		
		int totalDistance = 384400*2;
		double totalTimeD = Math.ceil(totalDistance/average);
		double totalTime = totalTimeD +3;
		double fuel = (litersForKm*totalDistance)/100;
		
		System.out.printf("%.0f%n",totalTime);
		System.out.printf("%.0f",fuel);
	}

}
