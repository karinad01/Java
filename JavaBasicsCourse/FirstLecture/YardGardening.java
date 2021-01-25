package part.one;
import java.util.Scanner;

public class YardGardening {

	public static void main(String[] args) {
		
		double priceOneQuadratMeter = 7.61;
		
		Scanner scan = new Scanner (System.in);
		double QuadratMeter = Double.parseDouble(scan.nextLine());
		
		double PriceWithoutDiscount = QuadratMeter*priceOneQuadratMeter;
		double discountPrice = PriceWithoutDiscount - 18*PriceWithoutDiscount/100;
		double discount = 18*PriceWithoutDiscount/100;
		
		System.out.printf("The final price is %.2f\n", discountPrice);
		System.out.printf("The discount is: %.2f", discount);

	}

}
