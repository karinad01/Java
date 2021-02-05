package Exercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();

       boolean isValid = true;

       if(!lengthChecker(password)){
           isValid = false;
       }
        if(!letterChecker(password)){
            isValid = false;
        }
       if(!digitChecker(password)){
           isValid = false;
       }

       if(isValid){
           System.out.println("Password is valid");
       }
    }

    private static boolean letterChecker(String password) {
        boolean isLetter = false;

        for (int i = 0; i < password.length(); i++) {
            int ch = (int) password.charAt(i);
            if ((ch >= 65 && ch <= 90)) {
                isLetter = true;
            } else if (ch >= 48 && ch <= 57) {
                isLetter = true;
            } else if (ch >= 97 && ch <= 122) {
                isLetter = true;
            } else {
                isLetter = false;
                break;
            }
        }
        if (!isLetter) {
            System.out.println("Password must consist only of letters and digits");
            return false;
        } else {
            return true;
        }
    }

    private static boolean lengthChecker(String input) {
        if (input.length() >= 6 && input.length() <= 10) {
            return true;
        } else {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
    }

    private static boolean digitChecker(String input) {
        int digits = 0;
        for (int i = 0; i < input.length(); i++) {
            int ch = (int) input.charAt(i);
            if (ch >= 48 && ch <= 57) {
                digits++;
            }
        }
        if (digits < 2) {
            System.out.println("Password must have at least 2 digits");
            return false;
        } else {
            return true;
        }
    }


}