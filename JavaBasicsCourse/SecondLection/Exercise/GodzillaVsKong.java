package exercises.second;
import java.util.Scanner;
public class GodzillaVsKong {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double budget = Double.parseDouble(scan.nextLine());
		int statistsTotal = Integer.parseInt(scan.nextLine());
		double clothesPriceOne = Double.parseDouble(scan.nextLine());
		
		double decorTotal = budget*0.1;
		
		if (statistsTotal>150) {
			clothesPriceOne = clothesPriceOne - clothesPriceOne*10/100;
		}
		
		double clothesTotal = clothesPriceOne*statistsTotal;
		double filmTotal = clothesTotal + decorTotal;
		double rest = budget - filmTotal;
		
		
		if(filmTotal>budget) {
			System.out.println("Not enough money!");
			System.out.printf("Wingard needs %.2f leva more.", filmTotal - budget);
		}else {
			System.out.println("Action!");
			System.out.printf("Wingard starts filming with %.2f leva left.", rest);
		}

	}

}
