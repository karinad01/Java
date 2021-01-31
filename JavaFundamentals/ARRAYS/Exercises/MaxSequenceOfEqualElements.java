package Exercise;

import java.util.Scanner;
import java.util.Arrays;

public class G_MaxSequenceOfEqualNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        int bestLength = 0;
        int digit = 0;
        int currentLength = 1; //one element = length = one

        for (int i = 0; i < numbers.length - 1; i++) {
            int currentElement = numbers[i];
            int nextElement = numbers[i + 1];

            if (currentElement == nextElement) {
                currentLength++;

                if (currentLength > bestLength) {
                    bestLength = currentLength;
                    digit = currentElement;
                }
            }else{
                currentLength = 1; //begins from the start again
            }
        }
        for (int i = 0; i < bestLength; i++) {
            System.out.print(digit + " ");
        }
    }
}
