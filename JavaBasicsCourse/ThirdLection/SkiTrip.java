package Lab;
import java.util.Scanner;
public class SkiTrip {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int days = Integer.parseInt(scan.nextLine());
		String room = scan.nextLine();
		String grade = scan.nextLine();
		
		int nights = days -1;
		double price = 0;
		
		if(days<10) {
			if(room.equals("room for one person")) {
				price = 18*nights;
			}else if(room.equals("apartment")) {
				price = nights*25-nights*25*0.3;
			}else if(room.equals("president apartment")) {
				price = 35*nights-nights*35*0.1;
			}
		}else if(days>=10 && days<=15) {
			if(room.equals("room for one person")) {
				price = 18*nights;
			}else if(room.equals("apartment")) {
				price = nights*25-nights*25*0.35;
			}else if(room.equals("president apartment")) {
				price = 35*nights-nights*35*0.15;
			}
			
		}else if(days>15) {
			if(room.equals("room for one person")) {
				price = 18*nights;
			}else if(room.equals("apartment")) {
				price = nights*25-nights*25*0.5;
			}else if(room.equals("president apartment")) {
				price = 35*nights-nights*35*0.2;
			}
		}
		
		 if ("positive".equals(grade)){
             System.out.printf("%.2f", price + price*0.25);
         }else if ("negative".equals(grade)){
             System.out.printf("%.2f", price-price*0.1); 
         }
	}

}
