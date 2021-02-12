package ArrayList;

import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

public class RetainAllMethod {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Bob");
        al.add("Anna");
        al.add("Sue");
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Bob");
        al2.add("Bryan");
        al.retainAll(al2);
        System.out.println("iterating the elements after retaining the elements of al2");

        Iterator itr = al.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
