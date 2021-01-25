package exercises.first;
import java.util.Scanner;
public class FishTank {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int length = Integer.parseInt(scan.nextLine());
		int bright = Integer.parseInt(scan.nextLine());
		int height = Integer.parseInt(scan.nextLine());
		double percent = Double.parseDouble(scan.nextLine());

		double volume = length*bright*height;
		double liters = volume*0.001;
		double percentage = percent*0.01;
		
		double litersAll = liters*(1-percentage);
		System.out.printf("%.2f", litersAll);
	
	}

}
