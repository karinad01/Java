package Lab;
import java.util.Scanner;
public class TradeCommissions {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String city = scan.nextLine();
		double s = Double.parseDouble(scan.nextLine());
		
		double commission;
		
		if(s>=0 && s<= 500) {
			if(city.equals("Sofia")) {
				commission = 0.05*s;
				System.out.printf("%.2f", commission);
			}else if(city.equals("Varna")) {
				commission = 0.045*s;
				System.out.printf("%.2f", commission);
			}else if(city.equals("Plovdiv")) {
				commission = 0.055*s;
				System.out.printf("%.2f", commission);
			}else {
				System.out.println("error");
			}
		}else if(s>500 && s<=1000) {
			if(city.equals("Sofia")) {
				commission = 0.07*s;
				System.out.printf("%.2f", commission);
			}else if(city.equals("Varna")) {
				commission = 0.075*s;
				System.out.printf("%.2f", commission);
			}else if(city.equals("Plovdiv")) {
				commission = 0.08*s;
				System.out.printf("%.2f", commission);
			}else {
				System.out.println("error");
			}
		}else if(s>1000 && s<=10000) {
			if(city.equals("Sofia")) {
				commission = 0.08*s;
				System.out.printf("%.2f", commission);
			}else if(city.equals("Varna")) {
				commission = 0.1*s;
				System.out.printf("%.2f", commission);
			}else if(city.equals("Plovdiv")) {
				commission = 0.12*s;
				System.out.printf("%.2f", commission);
			}else {
				System.out.println("error");
			}
		}else if(s>10000) {
			if(city.equals("Sofia")) {
				commission = 0.12*s;
				System.out.printf("%.2f", commission);
			}else if(city.equals("Varna")) {
				commission = 0.13*s;
				System.out.printf("%.2f", commission);
			}else if(city.equals("Plovdiv")) {
				commission = 0.145*s;
				System.out.printf("%.2f", commission);
			}else {
				System.out.println("error");
			}
		}else {
			System.out.println("error");
		}

	}

}
