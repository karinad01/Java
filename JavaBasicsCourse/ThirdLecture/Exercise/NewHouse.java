package Exercises;
import java.util.Scanner;
public class NewHouse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String flowerType = scan.nextLine();
		int flowersTotal = Integer.parseInt(scan.nextLine());
		int budget = Integer.parseInt(scan.nextLine());
		
		double price = 0.00;
		
		switch(flowerType) {
		case "Roses":
			price = 5*flowersTotal;
			if(flowersTotal>80) {
				price = 5*flowersTotal - 5*flowersTotal*0.1;
			}
			break;
		case "Dahlias":
			price = 3.8*flowersTotal;
			if(flowersTotal>90) {
			price = 3.8*flowersTotal - 3.8*flowersTotal*0.15;
			}
			break;
		case "Tulips":
			price = 2.8*flowersTotal;
			if(flowersTotal>80) {
				price = 2.8*flowersTotal-2.8*flowersTotal*0.15;
			}
			break;
		case "Narcissus":
			price = 3*flowersTotal;
			if(flowersTotal < 120) {
				price = 3*flowersTotal+3*flowersTotal*0.15;
			}
			break;
		case "Gladiolus":
			price = 2.5*flowersTotal;
			if(flowersTotal<80) {
				price = 2.5*flowersTotal+2.5*flowersTotal*0.2;
			}
			break;
		}

		if(budget<price) {
			System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
		}else if(budget>=price) {
			System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersTotal, flowerType, budget-price );
		}
		
	}

}
