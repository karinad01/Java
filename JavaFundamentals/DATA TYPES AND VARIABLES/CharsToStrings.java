package Lab;

import java.util.Scanner;

public class CharsToStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char first = scan.nextLine().charAt(0);
        char second = scan.nextLine().charAt(0);
        char third = scan.nextLine().charAt(0);

        String result = String.format("%c%c%c",first,second,third);
        System.out.println(result);
    }
}
