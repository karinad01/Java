package SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, String> emailsData = new LinkedHashMap<>();
        String name = scan.nextLine();

        while (!name.equals("stop")) {
            String email = scan.nextLine();
            //adding only emails, which don't have us uk or com
            //adding
            if (!email.endsWith("us") && !email.endsWith("uk") && !email.endsWith("com")) {
                //valid email
                emailsData.put(name, email);
            }
            //not adding

            name = scan.nextLine();
        }
        for (Map.Entry<String, String> emails : emailsData.entrySet()) {
            System.out.println(emails.getKey() + " -> " + emails.getValue());
        }

    }
}
