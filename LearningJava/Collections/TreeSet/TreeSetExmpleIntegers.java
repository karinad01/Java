package TreeSet;

import java.util.TreeSet;

public class TreeSetExmpleIntegers {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(24);
        set.add(66);
        set.add(12);
        set.add(15);

        System.out.println("Lowest value: " + set.pollFirst());
        System.out.println("Highest value: " + set.pollLast());
    }
}
