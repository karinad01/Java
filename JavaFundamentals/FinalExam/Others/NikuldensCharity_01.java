package Exam;

import java.util.Scanner;

public class NikuldensCharity_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Finish")) {
            String[] commandArr = command.split("\\s+");
            String instruction = commandArr[0];

            switch (instruction) {
                case "Replace":
                    message = message.replace(commandArr[1].charAt(0), commandArr[2].charAt(0));
                    System.out.println(message);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(commandArr[1]);
                    int endIndex = Integer.parseInt(commandArr[2]);

                    if (startIndex >= 0 && endIndex < message.length()) {
                        String first = message.substring(0, startIndex);
                        String second = message.substring(endIndex + 1);
                        message = first + second;
                        System.out.println(message);
                    } else {
                        System.out.println("Invalid indexes!");
                    }
                    break;
                case "Make":
                    String addition = commandArr[1];
                    if (addition.equals("Upper")) {
                        message = message.toUpperCase();
                    } else if (addition.equals("Lower")) {
                        message = message.toLowerCase();
                    }
                    System.out.println(message);
                    break;
                case "Check":
                    String substring = commandArr[1];
                    if (message.contains(substring)) {
                        System.out.println("Message contains " + substring);
                    } else {
                        System.out.println("Message doesn't contain " + substring);
                    }
                    break;
                case "Sum":
                    int startIndex2 = Integer.parseInt(commandArr[1]);
                    int endIndex2 = Integer.parseInt(commandArr[2]);
                    if (startIndex2 >= 0 && endIndex2 < message.length()) {
                        int sum = 0;
                        for (int i = startIndex2; i <= endIndex2; i++) {
                            sum += message.charAt(i);
                        }
                        System.out.println(sum);
                    } else {
                        System.out.println("Invalid indexes!");
                    }
                    break;
            }
            command = scanner.nextLine();
        }
    }
}