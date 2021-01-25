import java.util.Scanner;

public class Zadacha3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String country = scan.nextLine();
		String type = scan.nextLine();
		int num = Integer.parseInt(scan.nextLine());
		double price = 0.0;
		boolean validStock = false;
		boolean validCountry = false;

		switch (country) {
		case "Argentina":
			validCountry = true;
			if (type.equals("flags")) {
				validStock = true;
				price = 3.25 * num;
			} else if (type.equals("caps")) {
				validStock = true;
				price = 7.2 * num;
			} else if (type.equals("posters")) {
				validStock = true;
				price = 5.1 * num;
			} else if (type.equals("stickers")) {
				validStock = true;
				price = 1.25 * num;
			} else {
				validStock = false;
			}
			break;
		case "Brazil":
			validCountry = true;
			if (type.equals("flags")) {
				validStock = true;
				price = 4.2 * num;
			} else if (type.equals("caps")) {
				validStock = true;
				price = 8.5 * num;
			} else if (type.equals("posters")) {
				validStock = true;
				price = 5.35 * num;
			} else if (type.equals("stickers")) {
				validStock = true;
				price = 1.20 * num;
			} else {
				validStock = false;
			}
			break;
		case "Croatia":
			validCountry = true;
			if (type.equals("flags")) {
				validStock = true;
				price = 2.75 * num;
			} else if (type.equals("caps")) {
				validStock = true;
				price = 6.9 * num;
			} else if (type.equals("posters")) {
				validStock = true;
				price = 4.95 * num;
			} else if (type.equals("stickers")) {
				validStock = true;
				price = 1.10 * num;
			} else {
				validStock = false;
			}
			break;
		case "Denmark":
			validCountry = true;
			if (type.equals("flags")) {
				validStock = true;
				price = 3.10 * num;
			} else if (type.equals("caps")) {
				validStock = true;
				price = 6.50 * num;
			} else if (type.equals("posters")) {
				validStock = true;
				price = 4.80 * num;
			} else if (type.equals("stickers")) {
				validStock = true;
				price = 0.90 * num;
			} else {
				validStock = false;
			}
			break;
			
//			default:
//				System.out.println("Invalid country!");
//			break;
			

		}

		if (validStock) {
			System.out.printf("Pepi bought %d %s of %s for %.2f lv.", num,type, country, price);
		}else if(!validStock) {
			System.out.println("Invalid stock!");
		}if(!validCountry){
			System.out.println("Invalid country!");
		}
	}
}
