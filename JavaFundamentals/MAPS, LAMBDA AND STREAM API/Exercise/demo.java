package Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //phonebook
        //name -> phone number

        Map<String, Integer> phonebook = new HashMap<>();
        phonebook.put("Ivan", 5432);
        phonebook.putIfAbsent("Ivan", 24121);

        System.out.println(phonebook.get("Ivan"));
        //shows the value associated with Ivan


    }
}
