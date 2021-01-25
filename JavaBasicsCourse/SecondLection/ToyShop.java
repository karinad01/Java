package lab;

import java.util.Scanner;

public class ToyShop {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double tripPrice = Double.parseDouble(scan.nextLine());
		int puzzleNumber = Integer.parseInt(scan.nextLine());
		int dollNumber = Integer.parseInt(scan.nextLine());
		int teddyNumber = Integer.parseInt(scan.nextLine());
		int mignonNumber = Integer.parseInt(scan.nextLine());
		int truckNumber = Integer.parseInt(scan.nextLine());

		double sumLv = 2.6 * puzzleNumber + 3 * dollNumber + 4.1 * teddyNumber + 8.2 * mignonNumber + 2 * truckNumber;

		int toysNum = puzzleNumber + dollNumber + teddyNumber + mignonNumber + truckNumber;
		
		
		double roomCosts = 10*sumLv/100;
		double restMoney = sumLv - roomCosts;

		double rest;
		if (toysNum >= 50) {
			double promotion = 25 * restMoney / 100;
		    rest = restMoney - promotion;
		}	else {
				rest = restMoney;
			}

		
		if(rest >= tripPrice) {
			System.out.printf("Yes! %.2f lv left.", rest - tripPrice );
		}else {
			System.out.printf("Not enough money! %.2f lv needed.", tripPrice - rest);
		}
	}
	
}
