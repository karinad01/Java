package exercises.first;
import java.util.Scanner;
public class CharityCampaign {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int days = Integer.parseInt(scan.nextLine());
		int cookers = Integer.parseInt(scan.nextLine());
		int cakes = Integer.parseInt(scan.nextLine());
		int waffles = Integer.parseInt(scan.nextLine());
		int pancakes = Integer.parseInt(scan.nextLine());
		
		double cakePrice = 45*cakes;
		double wafflePrice = 5.8*waffles;
		double pancakePrice = 3.2*pancakes;
		
		double sumOne = (cakePrice+wafflePrice+pancakePrice)*cookers;
		double sumCampaign = days*sumOne;
		double sumAll = sumCampaign - sumCampaign/8;
		
		System.out.printf("%.2f", sumAll);
		
	}

}
