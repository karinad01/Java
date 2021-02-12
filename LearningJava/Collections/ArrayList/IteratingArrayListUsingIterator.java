package ArrayList;

import java.util.*;

public class IteratingArrayListUsingIterator {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<String>(); //creating ArrayList
        //adding objects in arraylist
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        Iterator itr = list.iterator();

        while(itr.hasNext()){
            //ckeck if the iterator has elements
            System.out.println(itr.next());
        }


    }
}
