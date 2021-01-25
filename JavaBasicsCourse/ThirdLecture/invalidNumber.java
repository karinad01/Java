package Lab;
import java.util.Scanner;
public class invalidNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		
		if( num<= 200 && num>= 100 || num==0) {
			
		}else {
			System.out.println("invalid");
		}

	}

}
