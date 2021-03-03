package com.company;

import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        double orderPrice = 0.0;
        double total = 0.0;
        for (int i = 0; i < n; i++) {
            double priceCapsule = Double.parseDouble(scan.nextLine());
            int days = Integer.parseInt(scan.nextLine());
            int capsulesCount = Integer.parseInt(scan.nextLine());
            orderPrice = 1.0*capsulesCount*days*priceCapsule;
            total+=orderPrice;
            System.out.printf("The price for the coffee is: $%.2f%n", orderPrice);
        }
        System.out.printf("Total: $%.2f",total);
    }
}
