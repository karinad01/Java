package exercises.first;
import java.util.Scanner;
public class VacationBooksList {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int pages = Integer.parseInt(scan.nextLine());
		int pagesPerHour=Integer.parseInt(scan.nextLine());
		int days = Integer.parseInt(scan.nextLine());
		
		int readTime = pages/pagesPerHour;
		int hours = readTime/days;
		
		System.out.println(hours);
	}

}
