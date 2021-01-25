package Exercises;

import java.util.Scanner;

public class TrueOnTimeForTheExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int examHours = Integer.parseInt(scan.nextLine());
		int examMinutes = Integer.parseInt(scan.nextLine());
		int arriveHours = Integer.parseInt(scan.nextLine());
		int arriveMinutes = Integer.parseInt(scan.nextLine());

		String late = "Late";
		String onTime = "On time";
		String early = "Early";
		
		int examTime = (examHours*60) + examMinutes;
		int arriveTime = (arriveHours*60) + arriveMinutes;
		int totalDifference = arriveTime - examTime;
		
		String studentArrival = late;
		if(totalDifference <-30) {
			studentArrival = early;
		}else if(totalDifference <=0) {
			studentArrival = onTime;
		}
		
		String result = "";
		if(totalDifference != 0) {
			int hoursDifference = Math.abs(totalDifference/60);
			int minutesDifference = Math.abs(totalDifference%60);
		
			if(hoursDifference > 0) {
				result = String.format("%d:%02d hours", hoursDifference, minutesDifference);
				
			}else {
				result = minutesDifference + " minutes";
				
			}
			if(totalDifference < 0) {
				result += " before the start";
				
			}else {
				result += " after the start";
			}
		}
	
		System.out.println(studentArrival);
		if(!result.isEmpty()) {
			System.out.println(result);
		}
	}
}