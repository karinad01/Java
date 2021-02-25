package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> list = Arrays.stream(scan.nextLine().split("!"))
                .collect(Collectors.toList());

        String input = scan.nextLine();
        while(!input.equals("Go Shopping!")){
            String[] command = input.split("\\s+");
            String word1 = command[0];
            String product = command[1];
            int index = list.indexOf(product);

            switch (word1) {
                case "Urgent":
                    if (list.contains(product)) {
                        break;
                    } else if (index < 0) {
                        list.add(0, product);
                    }
                    break;
                case "Unnecessary":
                    if (0 <= index && index < list.size()) {
                        list.remove(product);
                    }
                    break;
                case "Correct":
                    String newItem = command[2];
                    if (list.contains(product)) {
                        list.set(index,newItem);
                    }
                    break;

                case"Rearrange":
                    if (list.contains(product) && 0 <= index && index < list.size()) {
                        list.remove(product);
                        list.add(product);
                    }
                    break;
            }
            input = scan.nextLine();
        }
        System.out.println(String.join(", ",list));
    }
}
