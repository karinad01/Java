package Exercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= num; i++) {
            if (firstProperty(i) && secondProperty(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean firstProperty(int num) {

        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        if (sum % 8 == 0) {
            return true;
        } else {
            return false;
        }
    }


    static boolean secondProperty(int num) {
        int counter = 0;
        while (num > 0) {
            if ((num % 10) % 2 == 1) {
                counter++;
            }
            num /= 10;
        }
        if (counter >= 1) {
            return true;
        } else {
            return false;
        }
    }
}
