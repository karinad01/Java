package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> items = Arrays.stream(scan.nextLine().split(", "))
                .collect(Collectors.toList());

        String commands = scan.nextLine();
        while (!commands.equals("Craft!")) {
            String[] tokens = commands.split(" - ");
            String command = tokens[0];
            String item = tokens[1];
            int index = items.indexOf(item);

            switch (command) {
                case "Collect":
                    if (items.contains(item)) {
                        break;
                    } else if (index < 0) {
                        items.add(item);
                    }
                    break;
                case "Drop":
                    if (0 <= index && index < items.size()) {
                        items.remove(item);
                    }
                    break;
                case "Combine Items":
                    String[] splitted = item.split(":");
                    String oldItem = splitted[0];
                    String newItem = splitted[1];
                    index = items.indexOf(oldItem) + 1;
                    if (items.contains(oldItem)) {
                        items.add(index, newItem);
                    }
                    break;
                case "Renew":
                    if (items.contains(item) && 0 <= index && index < items.size()) {
                        items.remove(item);
                        items.add(item);
                    }
                    break;
                default:
                    break;
            }

            commands = scan.nextLine();
        }
        System.out.println(items.toString().replaceAll("[\\[\\]]", ""));
    }
}
