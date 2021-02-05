package Lab;

import java.util.Scanner;

public class MultiplyEvenByOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num = Math.abs(num1);
        System.out.println(getMultipleOfEvensAndOdds(num));
    }

    private static int getMultipleOfEvensAndOdds(int n) {
        int evenSum = getSumOfEvenDigits(n);
        int oddSum = getSumOfOddDigits(n);
        return evenSum*oddSum;
    }

    private static int getSumOfOddDigits(int n) {
        int oddSum = 0;
        while (n>0) {
            if(n%2!=0) {
                oddSum += n % 10;
            }
            n = n / 10;
        }
        return oddSum;
    }

    private static int getSumOfEvenDigits(int n) {
        int evenSum = 0;

        while (n>0) {
            if(n%2==0) {
                evenSum += n % 10;
            }
            n = n / 10;
        }
        return evenSum;
    }
}
