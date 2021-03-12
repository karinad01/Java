package TextProcessing;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] banWords = scan.nextLine().split(", ");
        String text = scan.nextLine();

        for (String banWord : banWords) {
            if (text.contains(banWord)) {
                String replacement = repeatString("*", banWord.length());
                text = text.replace(banWord, replacement);
            }
        }
        System.out.println(text);

    }

    private static String repeatString(String s, int length) {
        String replacement = "";
        for (int i = 0; i < length; i++) {
            replacement += s;
        }
        return replacement;
    }
}