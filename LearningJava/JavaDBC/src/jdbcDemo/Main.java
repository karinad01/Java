package jdbcDemo;

import java.util.Scanner;

public class Main {
    public static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter DB username(Enter for 'root'): ");
        String username = scan.nextLine().trim();
        username = username.length() > 0 ? username : "root";

        System.out.println("Enter DB password(Enter for 'root'): ");
        String password = scan.nextLine().trim();
        password = password.length() > 0 ? password : "root";

        //1.Load the DB driver
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            System.err.printf("Database driver %s not found", DB_DRIVER);
        System.exit(0);
        }
        System.out.println("DB Driver loaded successfully.");

    }
}
