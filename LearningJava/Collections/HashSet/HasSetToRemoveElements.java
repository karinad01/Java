package HashSet;

import java.util.HashSet;

public class HasSetToRemoveElements {
    public static void main(String[] args) {

        HashSet<String> set=new HashSet<String>();
        set.add("Roger");
        set.add("Victoria");
        set.add("Augustus");
        set.add("Sue");

        System.out.println(set);

        set.remove("Roger");
        System.out.println("After removing Roger" + set);

        HashSet<String> set1=new HashSet<String>();
        set1.add("Asen");
        set1.add("Gustav");
        set.addAll(set1);
        System.out.println("Updated List: "+set);

        //Removing all the new elements from HashSet
        set.removeAll(set1);
        System.out.println("After invoking removeAll() method: "+set);

        set.removeIf(str->str.contains("Sue"));
        System.out.println(set);
        
        set.clear();
        System.out.println(set);
    }
}
