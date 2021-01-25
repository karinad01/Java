package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int snowballs = Integer.parseInt(scan.nextLine());
        double max = Double.MIN_VALUE;
        int maxSnowballTime = Integer.MIN_VALUE;
        int maxSnowballSnow = Integer.MIN_VALUE;
        int maxSnowballQuality = Integer.MIN_VALUE;

        for (int i = 1; i <= snowballs; i++) {
           double snowballValue = 0;
           int snowballSnow = Integer.parseInt(scan.nextLine());
            int snowballTime = Integer.parseInt(scan.nextLine());
            int snowballQuality = Integer.parseInt(scan.nextLine());
            int division = snowballSnow/snowballTime;
            snowballValue =Math.pow(division,snowballQuality);

            if (snowballValue > max) {
                max = snowballValue;
                maxSnowballTime = snowballTime;
                maxSnowballSnow = snowballSnow;
                maxSnowballQuality = snowballQuality;

            }
        }

        System.out.printf("%d : %d = %.0f (%d)",maxSnowballSnow,maxSnowballTime,max,maxSnowballQuality);
    }
}
