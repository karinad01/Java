package exercises.first;
import java.util.Scanner;
public class BirthdayParty {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int roomCosts = Integer.parseInt(scan.nextLine());
		
        double cake = roomCosts*20/100;
        double drinks = cake-(cake*45/100);
        double animator = roomCosts/3;
        double sum = roomCosts + cake + drinks + animator;
        
        System.out.println(sum);
		
	}

}
