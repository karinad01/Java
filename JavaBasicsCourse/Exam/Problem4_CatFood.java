import java.util.Scanner;

public class Zadacha4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());

		int group1 = 0;
		int group2 = 0;
		int group3 = 0;
		double total = 0.0;
	

		for (int i = 1; i <= num; i++) {
			double gr = Double.parseDouble(scan.nextLine());
			total += gr;
			
			 if (gr >= 100 && gr < 200)
             {
                 group1++;
             }
             else if (gr >= 200 && gr < 300)
             {
                 group2++;
             }
             else if (gr >= 300 && gr <= 400)
             {
                 group3++;
             }
			 
		}

		double price = (total/1000)*12.45;
		System.out.printf("Group 1: %d cats.%nGroup 2: %d cats.%nGroup 3: %d cats.%nPrice for food per day: %.2f lv.", group1,group2,group3,price);
	}

}
