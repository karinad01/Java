package ArrayList;

import java.util.ArrayList;

public class FindOutIfEmpty {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Is ArrayList Empty: " + al.isEmpty());
        al.add("Bob");
        al.add("Victoria");
        al.add("Anna");
        System.out.println("After Insertion:");
        System.out.println("Is ArrayList Empty: " + al.isEmpty());

    }
}
