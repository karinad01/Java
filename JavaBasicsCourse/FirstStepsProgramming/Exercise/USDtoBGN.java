package exercises.first;
import java.util.Scanner;
public class USDtoBGN {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double dolars = Double.parseDouble(scan.nextLine());
		
		double lv = dolars*1.79549;
		
		System.out.println(lv);
		
	}

}
