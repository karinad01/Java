package SetsAndMaps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        //symbol - count of appearing
        TreeMap<Character, Integer> symbols = new TreeMap<>();

        for (int index = 0; index <= text.length() - 1; index++) {
            char currentSymbol = text.charAt(index);
            //count each symbol
            //there is no symbol ->
            if (!symbols.containsKey(currentSymbol)) {
                symbols.put(currentSymbol, 1);
            } else {
                //there is a symbol
                int currentCount = symbols.get(currentSymbol);
                symbols.put(currentSymbol, currentCount + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : symbols.entrySet()) {
            //symbol -> count
            System.out.println(entry.getKey() + ": " + entry.getValue() + " time/s");
        }
    }
}
