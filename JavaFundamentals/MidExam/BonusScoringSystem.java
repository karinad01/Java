package com.company;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countStudents = Integer.parseInt(scan.nextLine());
        int countLectures = Integer.parseInt(scan.nextLine());
        int bonus = Integer.parseInt(scan.nextLine());
        int maxAttend = 0;
        double maxBonus = 0;
        for (int i = 0; i < countStudents; i++) {
            int score = Integer.parseInt(scan.nextLine());
            double totalBonus = ((1.0 * score / countLectures) * (5 + bonus));
            if (totalBonus > maxBonus) {
                maxBonus = totalBonus;
                maxAttend = score;

            }
        }
        System.out.printf("Max Bonus: %.0f.%n",maxBonus);
        System.out.printf("The student has attended %d lectures.",maxAttend);

        }

    }


