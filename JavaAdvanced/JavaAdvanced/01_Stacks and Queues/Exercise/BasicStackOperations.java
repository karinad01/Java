package Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<Integer> stackNumbers = new ArrayDeque<>();
        String[] firstLine = scan.nextLine().split("\\s+");

        int n = Integer.parseInt(firstLine[0]);
        int s = Integer.parseInt(firstLine[1]);
        int x = Integer.parseInt(firstLine[2]);

        String[] numbers = scan.nextLine().split("\\s+");

        for (int i = 0; i < n; i++) {
            stackNumbers.push(Integer.parseInt(numbers[i]));
        }

        for (int j = 0; j < s; j++) {
            stackNumbers.pop();
        }

        if (stackNumbers.isEmpty()) {
            System.out.println("0");
        } else {
            if (stackNumbers.contains(x)) {
                System.out.println("true");
            } else {
                System.out.println(Collections.min(stackNumbers));
            }

        }
    }
}