package exercises.first;
import java.util.Scanner;
public class FruitMarket {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double strawberriesPrice = Double.parseDouble(scan.nextLine());
		double bananasInKg = Double.parseDouble(scan.nextLine());
		double orangesInKg = Double.parseDouble(scan.nextLine());
		double raspberriesInKg = Double.parseDouble(scan.nextLine());
		double strawberriesInKg = Double.parseDouble(scan.nextLine());
		
		double raspberriesPrice = strawberriesPrice*50/100;
		double orangePrice = raspberriesPrice - raspberriesPrice*40/100;
    	double bananasPrice = raspberriesPrice-raspberriesPrice*80/100;
		
    	double sumRaspberries = raspberriesInKg*raspberriesPrice;
    	double sumOranges = orangesInKg*orangePrice;
    	double sumBananas = bananasInKg*bananasPrice;
    	double sumStrawberries = strawberriesInKg*strawberriesPrice;
    	
    	double sum = sumRaspberries + sumOranges + sumBananas + sumStrawberries;
		System.out.printf("%.2f", sum);

	}

}
