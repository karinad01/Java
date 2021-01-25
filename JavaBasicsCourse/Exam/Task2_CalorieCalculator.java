import java.util.Scanner;
public class Zadacha2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String gender = scan.nextLine();
		double weight = Double.parseDouble(scan.nextLine());
		double height = Double.parseDouble(scan.nextLine());
		int age = Integer.parseInt(scan.nextLine());
		String activity = scan.nextLine();
		
		double heightInCm = height*100;
		
		double bnm = 0;
		if(gender.equals("m")) {
			bnm = 66+(13.7*weight)+(5*heightInCm)-(6.8*age);
		}else if(gender.equals("f")) {
			bnm = 655+(9.6*weight)+(1.8*heightInCm)-(4.7*age);
		}
		
		if(activity.equals("sedentary")) {
			bnm *= 1.2;
		}else if(activity.equals("lightly active")) {
			bnm *=1.375;
		}else if(activity.equals("moderately active")) {
			bnm *=1.55;
		}else if(activity.equals("very active")) {
			bnm *=1.725;
		}
		
		bnm = Math.ceil(bnm);
		
		
		System.out.printf("To maintain your current weight you will need %.0f calories per day.", bnm); 
	}

}
