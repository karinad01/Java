package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();
        set.add("Roger");
        set.add("Viktoria");
        set.add("Asen");
        System.out.println("Traversing element though Iterator in descending order");

        Iterator i = set.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }
}
