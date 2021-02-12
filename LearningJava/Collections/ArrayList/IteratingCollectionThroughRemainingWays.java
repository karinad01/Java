package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratingCollectionThroughRemainingWays {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Claire");
        list.add("Mike");
        list.add("Ana");
        list.add("Bob");

        System.out.println("Traversing list through List Iterator:");
        //Element iteration in reverse order
        ListIterator<String> list1 = list.listIterator(list.size());
        while(list1.hasPrevious()){
            String str = list1.previous();
            System.out.println(str);
        }
        System.out.println("Traversing list though for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Traversing list through forEach() method:");
        //The forEach() method is a new feature in Java 8
        list.forEach(a->{   //lambda expression
            System.out.println(a);
        });

        System.out.println("Traversing list through forEachRemaining() method:");
        Iterator<String> itr=list.iterator();
        itr.forEachRemaining(a->
        {
            System.out.println(a);
        });

    }
}
