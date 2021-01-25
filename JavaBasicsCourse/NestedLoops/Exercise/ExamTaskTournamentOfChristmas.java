package Exercise;

import java.util.Scanner;

public class ExamTaskTournamentOfChristmas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int days = Integer.parseInt(scan.nextLine());
		
		int countWinDays = 0;
		double totalSum = 0.00;
		for (int i = 1; i <= days; i++) {
			String sport = scan.nextLine();
			
			int countWins = 0;
			int countLose = 0;
			double sumPerDay = 0.00;
			
			//plays
			while (!sport.equals("Finish")) {
				String result = scan.nextLine();
				
				if(result.equals("win")) {
					countWins++;
					sumPerDay += 20;
				}else if(result.equals("lose")) {
					countLose++;
				}
				
				
				sport = scan.nextLine();	
			}
			//End of the day
			if(countWins > countLose) {
				countWinDays++;
				sumPerDay *= 1.1;
			}
			totalSum += sumPerDay;
		}
		int loseDays = days - countWinDays;
		if(countWinDays > loseDays) {
			totalSum *= 1.2;
			System.out.printf("You won the tournament! Total raised money: %.2f", totalSum);
		}else {
			System.out.printf("You lost the tournament! Total raised money: %.2f", totalSum);
		}
	}

}
