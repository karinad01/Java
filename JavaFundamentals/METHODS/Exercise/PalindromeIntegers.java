package Exercise;

import java.util.Scanner;

public class palindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        while (!command.equals("END")) {
            int num = Integer.parseInt(command);

            System.out.println(isPalindrome(num));
            command = scan.nextLine();
        }
    }

    private static boolean isPalindrome(int num) {
        int reversedInteger = 0;
        int remainder, originalInteger;
        originalInteger = num;
        boolean isItPalindrome = false;
        while (num != 0) {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num /= 10;
        }

        if (originalInteger == reversedInteger) {
            isItPalindrome = true;
        } else {
            isItPalindrome = false;
        }
        return isItPalindrome;
    }
}
