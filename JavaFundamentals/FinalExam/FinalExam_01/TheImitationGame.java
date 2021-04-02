package Exam;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String encryptedMessage = scan.nextLine();
        StringBuilder messages = new StringBuilder();

        String command = scan.nextLine();
        while (!command.equals("Decode")) {
            String[] tokens = command.split("\\|");

            String operation = tokens[0];

            switch (operation) {
                case "Move":
                    int numberOfLetters = Integer.parseInt(tokens[1]);
                    messages.append(encryptedMessage, 0, numberOfLetters);

                    encryptedMessage = encryptedMessage.substring(numberOfLetters).concat(messages.toString());
                    messages.setLength(0);
                    break;

                case "Insert":
                    int index = Integer.parseInt(tokens[1]);
                    String value = tokens[2];
                    messages.append(encryptedMessage);

                    encryptedMessage = messages.insert(index, value).toString();

                    messages.setLength(0);
                    break;

                case "ChangeAll":
                    String substring = tokens[1];
                    String replacement = tokens[2];

                    if (encryptedMessage.contains(substring)) {
                        encryptedMessage = encryptedMessage.replace(substring, replacement);
                    }

                    break;
                default:
                    break;
            }


            command = scan.nextLine();
        }

        System.out.printf("The decrypted message is: %s", encryptedMessage);
    }
}
