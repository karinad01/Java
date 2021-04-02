package Exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SongEncryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String reg = "^(?<artist>[A-Z][a-z' ]+):(?<song>[A-Z][A-z ]+)$";

        Pattern p = Pattern.compile(reg);

        String input = "";

        while (!"end".equals(input = scanner.nextLine())) {
            Matcher m = p.matcher(input);
            if (m.find()) {
                String valid = m.group(0);
                int key = m.group("artist").length();

                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < valid.length(); i++) {
                    int current = valid.charAt(i) + key;
                    if (valid.charAt(i) == '\'' || valid.charAt(i) == ' ') {
                        sb.append(valid.charAt(i));
                    } else if (valid.charAt(i) == ':') {
                        sb.append('@');
                    } else {
                        int diff;
                        if (Character.isLowerCase(valid.charAt(i))) {
                            if (current > 122) {
                                diff = current - 122;
                                current = 96 + diff;
                                sb.append((char) current);
                            } else {
                                sb.append((char) current);
                            }
                        } else if (Character.isUpperCase(valid.charAt(i))) {
                            if (current > 90) {
                                diff = current - 90;
                                current = 64 + diff;
                                sb.append((char) current);
                            } else {
                                sb.append((char) current);
                            }
                        }
                    }
                }

                System.out.println("Successful encryption: " + sb);
            } else {
                System.out.println("Invalid input!");
            }
        }
    }
}