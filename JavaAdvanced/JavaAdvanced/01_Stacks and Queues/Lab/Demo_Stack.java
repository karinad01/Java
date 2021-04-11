package Lab;

import java.util.*;

public class Demo_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        ArrayDeque<Integer> stackOfNumbers = new ArrayDeque<>();

        stackOfNumbers.push(13);
        stackOfNumbers.push(42);

        System.out.println(stackOfNumbers.peek());
        System.out.println(stackOfNumbers.pop());
        System.out.println(stackOfNumbers.peek());
        System.out.println(stackOfNumbers.pop());

        for (int i = 0; i < 1000; i++) {
            stackOfNumbers.push(i);
            stackOfNumbers.pop();
        }

        int[] listOfNums = new int[1000];

        for (int i = 0; i < 1000; i++) {
            listOfNums[i] = i;
        }
    }
}
