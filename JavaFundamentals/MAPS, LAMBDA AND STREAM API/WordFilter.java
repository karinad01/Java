package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1. Read
        //2. Split in array
        //3. Loop -> printing only words with even letters

        String[] input = scan.nextLine().split("\\s+");

        Arrays.stream(input).filter(word -> word.length() % 2 == 0)
                .forEach(System.out::println);
    }
}
