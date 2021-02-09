package Exercise;

import java.util.Scanner;

public class factorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());

        double division = factorial(num1) / factorial(num2);
        System.out.printf("%.2f", division);
    }

    private static double factorial(double num1) {
        double fact1 = 1;
        for (int i = 1; i <= num1; i++) {
            fact1 = fact1 * i;
        }
        return fact1;
    }
}

