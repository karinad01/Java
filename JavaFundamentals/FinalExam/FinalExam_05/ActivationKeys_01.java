package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scan.nextLine());
        //List<String> activationKeys = new ArrayList<>();

        String command = scan.nextLine();
        while (!command.equals("Generate")) {
            String[] split = command.split(">>>");
            String instruction = split[0];

            switch (instruction) {
                case "Contains":
                    String text = split[1];
                    if (input.toString().contains(text)) {
                        System.out.println(input + " contains " + text);
                    } else if(!input.toString().contains(text)){
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String upperOrLower = split[1];
                    int fromIndex = Integer.parseInt(split[2]);
                    int toIndex = Integer.parseInt(split[3]);

                    if(isValidIndex(input,fromIndex) && isValidIndex(input,toIndex)) {

                        if (upperOrLower.equals("Upper")) {
                            for (int i = fromIndex; i < toIndex; i++) {
                                char current = input.charAt(i);
                                input.setCharAt(i, Character.toUpperCase(current));
                            }

                        } else if (upperOrLower.equals("Lower")) {
                            for (int i = fromIndex; i < toIndex; i++) {
                                char current = input.charAt(i);
                                input.setCharAt(i, Character.toLowerCase(current));
                            }
                        }
                    }
                    System.out.println(input);
                    break;
                case "Slice":
                    int startIndex = Integer.parseInt(split[1]);
                    int endIndex = Integer.parseInt(split[2]);

                    if(isValidIndex(input,startIndex) && isValidIndex(input,endIndex)) {
                        input.replace(startIndex, endIndex, "");
                    }
                    System.out.println(input);
                    break;
            }

            command = scan.nextLine();
        }
        System.out.println("Your activation key is: " + input);
    }

    static boolean isValidIndex(StringBuilder s, int index) {

        return index >= 0 && index < s.length();
    }
}
