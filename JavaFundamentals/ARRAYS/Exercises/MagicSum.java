package Exercise;

import java.util.Scanner;
import java.util.Arrays;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        int sum = Integer.parseInt(scan.nextLine());
        for (int index = 0; index <= numbers.length - 1; index++) {
            //the taken number from the array
            int number = numbers[index];
            for (int i = index; i <= numbers.length - 1; i++) {
                if (index == i) {
                    continue;
                }
                int number2 = numbers[i];
                if (number + number2 == sum) {
                    System.out.printf("%d %d%n", number, number2);
                }
            }
        }
    }
}
