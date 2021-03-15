package TextProcessing;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        String[] usernames = text.split(", ");

        //["element1", "element2", "element3"]
        for (String username : usernames) {
            //if valid -> printing it
            if (isValidUsername(username)) {
                System.out.println(username);
            }
        }
    }

    static boolean isValidUsername(String username) {
        if (username.length() < 3 || username.length() >= 16) {
            return false;
        }

        for (int index = 0; index <= username.length() - 1; index++) {
            char currentSymbol = username.charAt(index);
            if (!Character.isLetterOrDigit(currentSymbol) && currentSymbol != '-' && currentSymbol != '_') {
                return false;
            }

        }
        return true;
    }
}

