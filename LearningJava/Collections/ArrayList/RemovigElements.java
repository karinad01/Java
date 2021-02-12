package ArrayList;

import java.util.ArrayList;

public class RemovigElements {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Bob");
        al.add("Sue");
        al.add("Anna");
        al.add("Sandra");
        al.add("Ivan");
        System.out.println("An initial list of elements:" + al);
        //Removing specific element drom the arraylist
        al.remove("Sue");
        System.out.println("After invoking remove(object) method" +al);

        //Removing element on the basis of specific position
        al.remove(0);
        System.out.println("After invoking remove(object) method: "+al);

        //Creating another arraylist
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Maria");
        al2.add("Boris");
        //Adding new elements to arraylist
        al.removeAll(al2);
        System.out.println("After invoking removeAll() method: "+al);

        //Removing elements on the basis of specified condition
        al.removeIf(str->str.contains("Anna"));
        System.out.println("After invoking removeIf() method: "+al);

   //Removing all the elements available in the ist
        al.clear();
        System.out.println("After invoking clear() method: "+al);
    }
}
