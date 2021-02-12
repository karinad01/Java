package LinkedList;

import java.util.LinkedList;

public class AddElements {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Roger");
        ll.add("Victoria");
        ll.add("Anna");
        System.out.println("After invoking add(E e) method: "+ll);
        //Adding an elemetn at the specific position
        ll.add(1,"George");
        System.out.println("After invoking add(int index, E element) method: "+ll);

        LinkedList<String> ll2=new LinkedList<String>();
        ll2.add("Sue");
        ll2.add("Lola");
        //Adding second list elements to the first list
        ll.addAll(ll2);
        System.out.println("After invoking addAll(Collection<? extends E> c) method: "+ll);

        LinkedList<String> ll3=new LinkedList<String>();
        ll3.add("John");
        ll3.add("Bob");
        //Adding second list elements to the first list at specific position
        ll.addAll(1, ll3);
        System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+ll);
        //Adding an element at the first position
        ll.addFirst("Ily");
        System.out.println("After invoking addFirst(E e) method: "+ll);
        ll.addLast("Howard");
        System.out.println("After invoking addLast(E e) method: "+ll);

    }
}
