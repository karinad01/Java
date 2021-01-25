package part.one;
import java.util.Scanner;

public class PetShop {

	public static void main(String[] args) {
		
	     Scanner scan = new Scanner(System.in);
	        int dogNum = Integer.parseInt(scan.nextLine());
	        int otherNum = Integer.parseInt(scan.nextLine());
	        
	        double dogSum = dogNum*2.5;
	        double otherSum = otherNum*4;
	        double sum = dogSum + otherSum;

	        System.out.println(sum);


		
	}

}
