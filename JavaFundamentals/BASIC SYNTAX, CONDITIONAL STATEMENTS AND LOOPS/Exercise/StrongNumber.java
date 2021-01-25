package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());


        String str = Integer.toString(number);
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            int sum1 = 1;
            char x = str.charAt(i);
            int a = Character.getNumericValue(x);

            for (int k = 2; k <= a; k++) {
                sum1 *= k;
                sum += sum1;
            }
            }

            if (number == sum) {

                System.out.printf("yes");
            } else
                System.out.println("no");
        }
    }
