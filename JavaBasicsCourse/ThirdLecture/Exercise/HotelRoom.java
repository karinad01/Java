package Exercises;
import java.util.Scanner;
public class HotelRoom {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String month = scan.nextLine();
		int nights = Integer.parseInt(scan.nextLine());
		
		double priceApartment=0.00;
		double priceStudio = 0.00;
		
		switch(month) {
		case "May":
		case "October":
			
			priceApartment = 65*nights;
			priceStudio = 50*nights;
			if(nights>7 && nights <14) {
			    priceStudio = priceStudio - priceStudio*0.05;
			}else if(nights>14) {
				priceApartment = priceApartment - priceApartment*0.1;
				priceStudio = priceStudio - priceStudio*0.3;
			}
		System.out.printf("Apartment: %.2f lv.\n", priceApartment);
		System.out.printf("Studio: %.2f lv.", priceStudio);
	
		break;
			
		case "June":
		case "September":
			priceApartment = 68.7*nights;
			priceStudio = 75.2*nights;
			if(nights>14) {
				priceStudio = priceStudio - priceStudio*0.2;
				priceApartment = priceApartment - priceApartment*0.1;
			}
			System.out.printf("Apartment: %.2f lv.\n", priceApartment);
			System.out.printf("Studio: %.2f lv.", priceStudio);
			break;
			
		case "July":
		case "August":
			priceApartment = 77*nights;
			priceStudio = 76*nights;
			if(nights>14) {
				priceApartment = priceApartment-priceApartment*0.1;
			}
			System.out.printf("Apartment: %.2f lv.\n", priceApartment);
			System.out.printf("Studio: %.2f lv.", priceStudio);
			break;
			
		}

	}

}
