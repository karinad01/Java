package ArrayList;

import java.util.ArrayList;

public class ArrayListAddElements {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Intitial list of elements:"+al);
        //Adding elements to the end of the list
        al.add("Roger");
        al.add("Ivan");
        al.add("Alexander");

        System.out.println("After invoking add(E e) method" + al);
        //Adding an element at the specific position
        al.add(1,"George");
        System.out.println("After invoking add(int index,E element) method" + al);

        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Sue");
        al2.add("Bob");
        //Adding second list elements to the first list
        al.addAll(al2);
        System.out.println("After invoking adAll (Collection<? extends E> c) method" + al);

        ArrayList<String> al3 = new ArrayList<String>();
        al3.add("John");
        al3.add("Maddie");
        //Adding second list elements to the first list at specific position

        al.addAll(1,al3);
        System.out.println("After invoking addAll(int index, Collection<?extendsE>c) method"+al);
    }
}
