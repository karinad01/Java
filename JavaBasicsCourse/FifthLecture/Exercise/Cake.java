package exercise;

import java.util.Scanner;

public class Cake {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int width = Integer.parseInt(scan.nextLine());
		int length = Integer.parseInt(scan.nextLine());

		int allPieces = width * length;

		String input = scan.nextLine();
		boolean isFinished = false;

		while(!input.equals("STOP")) {
			int currentPieces = Integer.parseInt(input);
			allPieces -= currentPieces;
			
			if(allPieces <= 0) {
				isFinished = true;
				break;
			}
			
			
			
			
			input = scan.nextLine();
		}
		String output = "";
		
		if(isFinished) {
			output = String.format("No more cake left! You need %d pieces more.", Math.abs(allPieces));
		}else {
			output = String.format("%d pieces are left.", allPieces);
		}
		
		System.out.println(output);
	}

}
