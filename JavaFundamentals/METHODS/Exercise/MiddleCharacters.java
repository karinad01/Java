package Exercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        if (input.length() % 2 == 0) {
            midCharsEven(input);
        } else {
            midCharsOdd(input);
        }
    }

    private static void midCharsEven(String input) {
        int length = input.length();
        int middle = length / 2;
        System.out.print(input.charAt(middle-1));
        System.out.print(input.charAt(middle));
    }

    private static void midCharsOdd(String input) {
        int length = input.length();
        int middle = length / 2;
        System.out.println(input.charAt(middle));
    }
}
