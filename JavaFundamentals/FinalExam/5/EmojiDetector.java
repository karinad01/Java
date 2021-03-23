package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int mult = 1;

        String regexWords = "(?<name>([*]{2})[A-Z][a-z]{2,}([*]{2})|([:]{2})[A-Z][a-z]{2,}([:]{2}))";
        String regexDigits = "[0-9]";

        Pattern patternWords = Pattern.compile(regexWords);
        Pattern patternDigits = Pattern.compile(regexDigits);

        Matcher matcherWords = patternWords.matcher(input);
        Matcher matcherDigits = patternDigits.matcher(input);

        List<String> emoji = new ArrayList<>();
        List<String> allEmoji = new ArrayList<>();


        while (matcherDigits.find()) {
            int digit = Integer.parseInt(matcherDigits.group(0));
            mult = mult * digit;
        }

        while (matcherWords.find()) {
            String name = matcherWords.group("name");

            int sumChar = 0;
            for (int i = 2; i <name.length()-2 ; i++) {
                char sign = name.charAt(i);
                sumChar+= sign;
            }
            allEmoji.add(name);

            if(sumChar > mult){
                emoji.add(name);
            }
        }

        System.out.printf("Cool threshold: %d %n%d emojis found in the text. ", mult, allEmoji.size());
        System.out.print("The cool ones are:\n" + String.join("\n", emoji));
    }
}
