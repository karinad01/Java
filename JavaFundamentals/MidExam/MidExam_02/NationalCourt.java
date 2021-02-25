package com.company;

import java.util.Scanner;

public class NationalCourt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int e1 = Integer.parseInt(scan.nextLine());
        int e2 =Integer.parseInt(scan.nextLine());
        int e3 = Integer.parseInt(scan.nextLine());
        int people = Integer.parseInt(scan.nextLine());
  int days = 0;
        int sumHours = e1+e2+e3;

        int timeNeeded = 0;
        while (people>0) {
        people -= sumHours;
        timeNeeded++;

        if(timeNeeded%4 == 0 && timeNeeded != 0){
            timeNeeded++;
            if(timeNeeded>=24){
                days++;
                timeNeeded = timeNeeded-24;
            }
        }

        }
        System.out.printf("Time needed: %dh.", days*24+timeNeeded);
    }
}
