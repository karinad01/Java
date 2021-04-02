package Exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        Pattern pattern = Pattern.compile("^(U\\$)(?<username>[A-Z][a-z]{2,})\\1(P@\\$)(?<password>[A-Za-z]{5,}[0-9]+)\\3$");
        int sr = 0;
        for (int i = 0; i < n; i++) {
            Matcher matcher = pattern.matcher(sc.nextLine());
            if (isValid(matcher)==true){

                String username = matcher.group("username");
                String password = matcher.group("password");
                System.out.println("Registration was successful");
                System.out.println("Username: "+username +", Password: "+password);
                sr++;
            }else {
                System.out.println("Invalid username or password");
            }
        }
        System.out.println("Successful registrations: " + sr);


    }

    private static boolean isValid(Matcher matcher) {
        if (matcher.matches()){
            return true;
        }else {
            return false;
        }
    }
}