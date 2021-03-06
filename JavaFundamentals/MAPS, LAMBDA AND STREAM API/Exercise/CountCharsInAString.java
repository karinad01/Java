package Exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        //symbol -> number
        Map<Character, Integer> letterCount = new LinkedHashMap<>();

        for (int index = 0; index <= text.length() - 1; index++) {
            char currentSymbol = text.charAt(index);
            if (currentSymbol == ' ') {
                continue;
            }
            if (!letterCount.containsKey(currentSymbol)) {
                letterCount.put(currentSymbol, 1);
            } else {
                letterCount.put(currentSymbol, letterCount.get(currentSymbol) + 1);

            }
        }
        for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

}
