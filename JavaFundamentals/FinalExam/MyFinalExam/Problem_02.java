package Exam;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Problem_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());

        String regex = "^(?<start>[$|%])(?<name>[A-Z][a-z]{2,})\\k<start>: \\[(?<numOne>[\\d]+)\\]\\|\\[(?<numTwo>[\\d]+)\\]\\|\\[(?<numThree>[\\d]+)\\]\\|$";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < input; i++) {
            String sentence = scan.nextLine();
            Matcher match = pattern.matcher(sentence);
            if (match.find()) {
                int num1 =  Integer.parseInt(match.group("numOne"));
                int num2 =  Integer.parseInt(match.group("numTwo"));
                int num3 = Integer.parseInt(match.group("numThree"));

               String name = match.group("name");

                char one = (char)num1;
                char two = (char)num2;
                char three = (char)num3;
                System.out.printf("%s: %c%c%c%n",name, one,two,three);
            } else {
                System.out.println("Valid message not found!");
            }
        }
    }
}