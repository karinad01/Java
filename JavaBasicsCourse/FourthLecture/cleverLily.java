package lab;
import java.util.Scanner;
public class cleverLily {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int age = Integer.parseInt(scan.nextLine());
		double washmachinePrice = Double.parseDouble(scan.nextLine());
		int toyPrice = Integer.parseInt(scan.nextLine());
		
		int numberToys = 0;
		int savedMoney = 0;
		int moneyForBirthday = 10;
		
		for(int currentYear = 1; currentYear <= age; currentYear++) {
			if(currentYear % 2 == 0) {
				savedMoney += (moneyForBirthday - 1);
				moneyForBirthday += 10;
			}else {
				numberToys++;
				
			}
			
		}
		savedMoney += numberToys * toyPrice;
	
		System.out.println((savedMoney >= washmachinePrice ? String.format("Yes! %.2f",(savedMoney-washmachinePrice)) : String.format("No! %.2f", (washmachinePrice - savedMoney))));

	}

}
