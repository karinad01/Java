package exercise;
import java.util.Scanner;
public class OldBooks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String searchedBook = scan.nextLine();
		
		String input = scan.nextLine();
		
		boolean isFound = false;
		int count = 0;
		
		//while the input is different from "No More Books"
		while(!input.equals("No More Books")) {
			
			if(input.equals(searchedBook)) {
				isFound = true;
				break;
			}
			count++;
			input = scan.nextLine();
		}
		
		String output = "";
		if(isFound) {
			output = String.format("You checked %d books and found it.", count);
		}else {
			output = String.format("The book you search is not here!%n"
					+ "You checked %d books.", count);
		}
		
		System.out.println(output);
	}

}
