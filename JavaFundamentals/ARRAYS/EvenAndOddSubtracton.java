package ArraysLecture;

import java.util.Scanner;
import java.util.Arrays;

public class EvenAndOddSubtracton {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int[] numbers = Arrays.stream(input).mapToInt(e -> Integer.parseInt(e)).toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }
        int result = evenSum - oddSum;
        System.out.println(result);
    }
}
