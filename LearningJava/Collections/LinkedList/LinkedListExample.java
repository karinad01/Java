package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Roger");
        ll.add("Victoria");
        ll.add("Roger");
        ll.add("Anna");

        Iterator<String> itr = ll.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
