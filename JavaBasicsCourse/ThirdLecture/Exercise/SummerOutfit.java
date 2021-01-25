package Exercises;
import java.util.Scanner;
public class SummerOutfit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int grad = Integer.parseInt(scan.nextLine());
		String time = scan.nextLine();
		
		String outfit;
		String shoes;
		
		switch(time) {
		case "Morning":
			if(grad>= 10 && grad <= 18) {
				outfit = "Sweatshirt";
				shoes = "Sneakers";
				System.out.printf("It's %d degrees, get your %s and %s.", grad, outfit, shoes);
				break;
			}else if(grad > 18 && grad <=24) {
				outfit = "Shirt";
				shoes = "Moccasins";
				System.out.printf("It's %d degrees, get your %s and %s.", grad, outfit, shoes);
				break;
			}else if(grad>=25) {
				outfit = "T-Shirt";
				shoes = "Sandals";
				System.out.printf("It's %d degrees, get your %s and %s.", grad, outfit, shoes);
				break;
			}
			
		case "Afternoon":
			if(grad>= 10 && grad <= 18) {
				outfit = "Shirt";
				shoes = "Moccasins";
				System.out.printf("It's %d degrees, get your %s and %s.", grad, outfit, shoes);
				break;
			}else if(grad > 18 && grad <=24) {
				outfit = "T-Shirt";
				shoes = "Sandals";
				System.out.printf("It's %d degrees, get your %s and %s.", grad, outfit, shoes);
				break;
			}else if(grad>=25) {
				outfit = "Swim Suit";
				shoes = "Barefoot";
				System.out.printf("It's %d degrees, get your %s and %s.", grad, outfit, shoes);
				break;
			}
			
		case "Evening":
			if(grad>= 10 && grad <= 18) {
				outfit = "Shirt";
				shoes = "Moccasins";
				System.out.printf("It's %d degrees, get your %s and %s.", grad, outfit, shoes);
				break;
			}else if(grad > 18 && grad <=24) {
				outfit = "Shirt";
				shoes = "Moccasins";
				System.out.printf("It's %d degrees, get your %s and %s.", grad, outfit, shoes);
				break;
			}else if(grad>=25) {
				outfit = "Shirt";
				shoes = "Moccasins";
				System.out.printf("It's %d degrees, get your %s and %s.", grad, outfit, shoes);
				break;
			}
		}

	}

}
