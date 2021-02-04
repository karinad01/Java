package Lab;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        printSum(a, b);
    }

    public static void printSum(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        System.out.println(sum);
    }
}
