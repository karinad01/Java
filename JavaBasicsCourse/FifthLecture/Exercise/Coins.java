package exercise;
import java.util.Scanner;
public class Coins {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double sum = Double.parseDouble(scan.nextLine());
		
		double sumInCents = Math.floor(sum * 100);
		
		int coins = 0;
		
		while(sumInCents != 0) {
			if(sumInCents >= 200) {
				sumInCents -= 200;
			}else if(sumInCents >= 100) {
				sumInCents -= 100;
			}else if(sumInCents >= 50){
				sumInCents -= 50;
			}else if(sumInCents >= 20) {
				sumInCents -= 20;
			}else if(sumInCents >= 10) {
				sumInCents -= 10;
			}else if(sumInCents>=5) {
				sumInCents -= 5;
			}else if(sumInCents >= 2) {
				sumInCents -=2;
			}else if(sumInCents >=1) {
				sumInCents -= 1;
			}
			
			coins++;
		}
		System.out.println(coins);

	}

}
