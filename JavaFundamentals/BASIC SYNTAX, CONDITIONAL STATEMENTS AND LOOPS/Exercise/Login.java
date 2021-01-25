package Exercise;

import java.io.*;
import java.util.Scanner;
import java.util.*;
import java.lang.*;


public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        String password = scan.nextLine();

        StringBuilder pass = new StringBuilder();
        pass.append(username);
        pass.reverse();

        int tries = 0;

        while (!password.contentEquals(pass)){

            if(tries==3){
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            tries++;

            password = scan.nextLine();
        }
        if(password.contentEquals(pass)) {
            System.out.printf("User %s logged in.", username);

        }
    }
}
