package ArraysLecture;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int currentDay = Integer.parseInt(scan.nextLine());

        if (currentDay >= 1 && currentDay <= 7) {
            System.out.println(daysOfWeek[currentDay - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
