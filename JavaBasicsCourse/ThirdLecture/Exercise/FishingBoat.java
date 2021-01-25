package Exercises;
import java.util.Scanner;
public class FishingBoat {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int budget = Integer.parseInt(scan.nextLine());
		String season = scan.nextLine();
		int fishermans = Integer.parseInt(scan.nextLine());
		
		int rentPrice = 0;
		double discount = 0.00;
		
		switch(season) {
		case "Spring":
			rentPrice = 3000;
			break;
			
		case "Summer":
			rentPrice = 4200;
			break;
			
		case "Autumn":
			rentPrice = 4200;
			break;
		case "Winter":
			rentPrice = 2600;
			break;
		}
		
		if(fishermans<=6) {
			discount = rentPrice - rentPrice*0.1;
		}else if(fishermans>=7 && fishermans <=11) {
			discount = rentPrice - rentPrice*0.15;
		}else if(fishermans>12) {
			discount = rentPrice - rentPrice*0.25;
		}
		
		if(fishermans%2 == 0 && !season.equals("Autumn")) {
			discount = discount - discount*0.05;
		}
		
		if(budget>=discount) {
			System.out.printf("Yes! You have %.2f leva left.", budget - discount);
		}else if(budget<discount) {
			System.out.printf("Not enough money! You need %.2f leva.", discount - budget);
		}
		
		
		
	}

}
