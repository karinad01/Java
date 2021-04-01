package Exam;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String password = scan.nextLine();

        String input = scan.nextLine();

        while (!input.equals("Done")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            switch (command) {
                case "TakeOdd": {
                    String temporary = "";
                    for (int i = 1; i < password.length(); i += 2) {
                        temporary += password.charAt(i);
                    }

                    password = temporary;

                    System.out.println(password);
                    break;
                }
                case "Cut": {
                    int index = Integer.parseInt(tokens[1]);
                    int length = Integer.parseInt(tokens[2]);

                    String firstPart = password.substring(0, index);
                    String secondPart = password.substring(index + length);

                    password = firstPart + secondPart;

                    System.out.println(password);

                    break;
                }
                case "Substitute": {
                    String searching = tokens[1];
                    String replacement = tokens[2];
                    String temporary = "";

                    if(password.contains(String.valueOf(searching))){
                        temporary = password.replaceAll(searching,replacement);
                        password = temporary;

                        System.out.println(password);
                    }else{
                        System.out.println("Nothing to replace!");
                    }

                    break;
                }
            }


            input = scan.nextLine();
        }

        System.out.println("Your password is:" + " " + password);
    }
}
