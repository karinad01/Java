package LinkedList;

import java.util.LinkedList;

public class RemovingElements {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Roger");
        ll.add("Victoria");
        ll.add("Anna");
        ll.add("Asen");
        ll.add("George");
        ll.add("Howard");
        ll.add("Bob");
        ll.add("Gustav");
        ll.add("Mike");
        ll.add("Lola");
        System.out.println("Initial list of elements: "+ll);
        //Removing specific element from arraylist
        ll.remove("Victoria");
        ll.remove(0);
        System.out.println("After removing Victoria and index 0: " + ll);

        LinkedList<String> ll2 = new LinkedList<String>();
        ll2.add("Michael");
        ll2.add("Jordan");
        ll.addAll(ll2);
        System.out.println("Updated list" + ll);
        //Removing all the new elements from the arraylist
        ll.removeAll(ll2);
        System.out.println("After invoking removeAll() method" + ll);

        ll.removeLast();
        ll.removeFirst();
        System.out.println("Removing teh first and the last element: " + ll);

        ll.removeFirstOccurrence("Gustav");
        System.out.println("RemoveOccurrence method (FIRST):" +ll);

   ll.removeLastOccurrence("Asen");
        System.out.println("RemoveOccurrence method (LAST):" +ll);

        ll.clear();
        System.out.println("Cleared linked list:" + ll);
    }
}
