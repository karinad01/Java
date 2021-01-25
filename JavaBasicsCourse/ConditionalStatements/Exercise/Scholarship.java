package exercises.second;

import java.util.Scanner;

public class Scholarship {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double income = Double.parseDouble(scan.nextLine());
		double averrageGrades = Double.parseDouble(scan.nextLine());
		double minSalary = Double.parseDouble(scan.nextLine());
		
		double socialScholarship = 0.35*minSalary;
		double excellentScholarship = averrageGrades*25;
		
		 boolean canBecomeExcellent = false;
	     boolean canBecomeSocial = false;
		
		if(income<minSalary && averrageGrades > 4.5 ) {
			canBecomeSocial = true;
		}
		
		if(averrageGrades>=5.5) {
			
			canBecomeExcellent = true;
		}
		
		if(canBecomeSocial == true && canBecomeExcellent == true) {
		if(socialScholarship >= excellentScholarship) {
			System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialScholarship));
		}else {
			System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excellentScholarship));
		}
	}else if (canBecomeSocial == true) {
			System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialScholarship));	
		}else if(canBecomeExcellent == true) {
			System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excellentScholarship));
	}else

	{
		System.out.println("You cannot get a scholarship!");
	}

}
}