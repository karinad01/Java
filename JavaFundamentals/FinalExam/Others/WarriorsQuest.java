package Exam;

import java.util.Scanner;

public class WarriorsQuest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();
        String commands = sc.nextLine();

        while (!commands.equals("For Azeroth")) {
            String[] command = commands.split("\\s+");
            String cases = command[0];

            switch (cases) {
                case "GladiatorStance":
                    string = string.toUpperCase();
                    System.out.println(String.format(string));
                    break;
                case "DefensiveStance": {
                    string = string.toLowerCase();
                    System.out.println(String.format(string));
                }
                break;
                case "Dispel":
                    int index = Integer.parseInt(command[1]);
                    char letter = command[2].charAt(0);
                    StringBuilder tempString = new StringBuilder(string);
                    if (index >= 0 && index <= string.length() - 1) {
                        tempString.setCharAt(index, letter);
                        string = tempString.toString();
                        System.out.println(String.format("Success!"));
                    } else {
                        System.out.println(String.format("Dispel too weak."));
                    }
                    break;
                case "Target":
                    if (command[1].equals("Change")) {
                        String substring = command[2];
                        String substringTwo = command[3];
                        string = string.replace(substring, substringTwo);
                        System.out.println(String.format(string));
                    } else if (command[1].equals("Remove")) {
                        String substringR = command[2];
                        string = string.replace(substringR, "");
                        System.out.println(String.format(string));
                    } else {
                        System.out.println("Command doesn't exist!");
                    }
                    break;
                default:
                    System.out.println("Command doesn't exist!");
            }
            commands = sc.nextLine();
        }
    }
}