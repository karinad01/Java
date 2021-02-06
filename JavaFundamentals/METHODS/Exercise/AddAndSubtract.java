package com.company;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());
        sum(num1, num2, num3);
    }

    private static void sum(int num1, int num2, int num3) {
        int sum = num1 + num2;
        System.out.println(subtract(sum, num3));
    }

    private static int subtract(int sum, int num3) {
        int result = sum - num3;
        return result;
    }


}
