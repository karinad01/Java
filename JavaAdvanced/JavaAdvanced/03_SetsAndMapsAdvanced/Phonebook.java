package SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //name(String) - phone number(String)
        LinkedHashMap<String, String> phonebook = new LinkedHashMap<>();
        String input = scan.nextLine();
        while (!input.equals("search")) {
            String name = input.split("-")[0];
            String phoneNumber = input.split("-")[1];
            phonebook.put(name, phoneNumber);


            input = scan.nextLine();
        }
        String name = scan.nextLine();

        while (!name.equals("stop")) {
            //name is in the phonebook
            if (phonebook.containsKey(name)) {
                System.out.printf("%s -> %s%n", name, phonebook.get(name));
            } else {
                //name is not in the phonebook
                System.out.printf("Contact %s does not exist.%n", name);

            }

            name = scan.nextLine();
        }
    }
}
