package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class LargestThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");

        Arrays.stream(input)
                .map(Integer::parseInt)
                .sorted((left, right) -> right.compareTo(left))
                .limit(3)
                .forEach(e->System.out.print(e + " "));
    }
}
