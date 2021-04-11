package Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String expression = scan.nextLine();

        ArrayDeque<Integer> openingBrackets = new ArrayDeque<>();

        for (int i = 0; i < expression.length(); i++) {
            char symbol = expression.charAt(i);
            if (symbol == '(') {
                openingBrackets.push(i);
            } else if (symbol == ')') {

                System.out.println(expression.substring(openingBrackets.pop(), i+1));
            }
        }
    }
}
