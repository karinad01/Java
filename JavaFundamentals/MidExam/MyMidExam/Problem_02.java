package com.company;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scan.nextLine();

        while (!command.equals("Mort")) {
            String[] tokens = command.split(" ");
            String operation = tokens[0];
            int num = Integer.parseInt(tokens[1]);
            int index = numbers.indexOf(num);
            switch (operation) {
                case "Add":
                    numbers.add(num);
                    break;

                case "Remove":
                    while(numbers.contains(num)) {
                            numbers.remove(index);
                            break;
                    }

                    break;
                case "Replace":
                    int newItem = Integer.parseInt(tokens[2]);
                    if (numbers.contains(num)) {
                        numbers.set(index,newItem);
                    }
                    break;

                case "Collapse":
                    for (int i = 0; i < numbers.size(); i++) {

                        if(numbers.get(i)<num){
                            numbers.remove(i);
                            i--;
                        }
                    }
                    break;
            }

            command = scan.nextLine();
        }

        System.out.print(Arrays.toString(new List[]{numbers})
                .replaceAll("[\\[\\]]", "").replaceAll(", ", " "));
    }
}
