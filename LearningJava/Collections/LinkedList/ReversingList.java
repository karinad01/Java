package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class ReversingList {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Roger");
        ll.add("Anna");
        ll.add("Augustus");
        //Traversing the list of elements in reverse order
        Iterator i = ll.descendingIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
