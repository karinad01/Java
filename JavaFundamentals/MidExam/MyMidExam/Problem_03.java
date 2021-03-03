package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Treta {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        String[] command = scan.nextLine().split(" ");

        while (!command[0].equals("end")) {
            switch (command[0]) {
                case "Chat":
                    list.add(command[1]);
                    break;

                case "Delete":
                    for (int i = 0; i < list.size(); i++) {
                        if (list.contains(command[1])) {
                            list.remove(command[1]);
                        }
                    }
                    break;

                case "Edit":

                    int index = list.indexOf(command[1]);
                    String newItem = command[2];
                    for (int i = 0; i < list.size(); i++) {
                        if (list.contains(command[1])) {
                            list.set(index,newItem);
                        }
                    }
                    break;

                case "Pin":
                    for (int i = 0; i < list.size(); i++)
                    {
                        if (list.contains(command[1]))
                        {
                            list.add(command[1]);
                            list.remove(command[1]);
                            break;
                        }
                    }
                    break;

                case "Spam":
                    for (int i = 1; i < command.length; i++)
                    {
                        list.add(command[i]);
                    }
                    break;
            }

            command = scan.nextLine().split(" ");
        }

        System.out.println(String.join("\n", list));
    }
}
