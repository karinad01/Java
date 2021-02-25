package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] houses = Arrays.stream(scan.nextLine().split("@"))
                .mapToInt(Integer::parseInt).toArray();

        String command;
        int currentIndex = 0;

        while (!(command = scan.nextLine()).equals("Love!")) {
            String[] tokens = command.split("\\s+");
            int length = Integer.parseInt(tokens[1]);
            currentIndex += length;

            if (currentIndex >= houses.length) {
                currentIndex = 0;
            }
            if (houses[currentIndex] != 0) {
                houses[currentIndex] -= 2;
                if (houses[currentIndex] == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", currentIndex);
                }
            } else {
                System.out.printf("Place %d already had Valentine's day.%n", currentIndex);
            }
        }
        System.out.printf("Cupid's last position was %d.%n", currentIndex);
        boolean isReached = true;

        for (int house : houses) {
            if (house != 0) {
                isReached = false;
                break;
            }
        }
        int count = 0;
        for (int house:houses) {
            if(house != 0){
                count++;
            }
        }
        if(isReached){
            System.out.println("Mission was successful.");
        }else{
            System.out.printf("Cupid has failed %d places.",count);
        }
    }
}
