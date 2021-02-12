package ArrayList;

import java.util.*;

public class getAndSetArrayList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Mango");
        al.add("Apple");
        al.add("Banana");
        al.add("Grapes");

        System.out.println("Returning element: " + al.get(1));
        //returns the second element

        al.set(1, "Dates");
        //changes the element at index 1

        for (String fruit : al) {
            System.out.println(fruit);
        }
    }
}
