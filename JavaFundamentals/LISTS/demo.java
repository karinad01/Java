package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        names.add("Peter");
        names.add("Maria");
        names.add("George");
        names.add("Ivan");
        names.remove(0);

        for (String name : names) {
            System.out.println(name);
        }

    }
}
