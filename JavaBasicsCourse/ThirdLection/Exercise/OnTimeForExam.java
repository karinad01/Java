package Exercises;

import java.util.Scanner;

public class OnTimeForExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int examHours = Integer.parseInt(scan.nextLine());
		int examMinutes = Integer.parseInt(scan.nextLine());
		int arriveHours = Integer.parseInt(scan.nextLine());
		int arriveMinutes = Integer.parseInt(scan.nextLine());

		int examTime = examHours * 60 + examMinutes;
		int arriveTime = arriveHours * 60 + arriveMinutes;
		int minutesDifference = arriveTime - examTime;

		if (minutesDifference < -30) {
			System.out.println("Early");
		} else if (minutesDifference <= 0) {
			System.out.println("On time");
		} else {
			System.out.println("Late");
		}
		if (minutesDifference != 0) {
			int hours = Math.abs(minutesDifference / 60);
			int minutes = Math.abs(minutesDifference % 60);
			if (hours > 0) {
				if (minutes > 10) {
					System.out.printf("%d:%02d hours",hours, minutes);

				
				if (minutesDifference < 0) {
					System.out.println(" before the start");
				} else {
					System.out.println(" after the start");
				}
			} else {
				System.out.print(hours + ":" + minutes + " hours");

				if (minutesDifference < 0) {
					System.out.print(" before the start");
				} else {
					System.out.print(" after the start");
				}
			}

		} else {
			System.out.print(minutes + " minutes");
			if (minutesDifference < 0) {
				System.out.print(" before the start");
			} else {
				System.out.print(" after the start");
			}
		}
	}
}
}

