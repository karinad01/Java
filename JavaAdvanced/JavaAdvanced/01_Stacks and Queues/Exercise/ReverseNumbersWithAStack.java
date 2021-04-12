package Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<String> numbers = new ArrayDeque<>();

        Arrays.stream(scan.nextLine().split("\\s+"))
                .forEach(numbers :: push);


        while (!numbers.isEmpty()){
            System.out.print(numbers.pop() + " ");

        }
    }
}
