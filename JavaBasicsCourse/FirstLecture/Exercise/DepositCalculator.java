package exercises.first;
import java.util.Scanner;
public class DepositCalculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double deposSum = Double.parseDouble(scan.nextLine());
		int month = Integer.parseInt(scan.nextLine());
		double percent = Double.parseDouble(scan.nextLine());
		
		double sumMonth = (deposSum*percent/100)/12;
		double sumYear = deposSum + month*sumMonth;
		
		System.out.println(sumYear);
	}

}
