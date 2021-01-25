package exercise;

import java.util.Scanner;

public class Vacation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double excursionPrice = Double.parseDouble(scan.nextLine());
		double currentMoney = Double.parseDouble(scan.nextLine());

		int spendDays = 0;
		int allDays = 0;
		
		boolean isFailed = false;

		while (excursionPrice > currentMoney) {
			String action = scan.nextLine();
			double money = Double.parseDouble(scan.nextLine());
            allDays++;
			if ("spend".equals(action)) {
				currentMoney -= money;
				if (currentMoney < 0) {
					currentMoney = 0;
				}
				spendDays++;
				if (spendDays == 5) {
					isFailed = true;
					break;
				}

			}else if("save".equals(action)) {
				currentMoney += money;
				spendDays = 0;

			}

		}
		String output = "";
		
		if(isFailed) {
			output = String.format("You can't save the money.%n"
					+ "%d", allDays );
		}else {
			output = String.format("You saved the money for %d days.", allDays);
		}
		System.out.println(output);
	}

}
