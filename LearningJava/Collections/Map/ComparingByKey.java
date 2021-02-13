package Map;

import java.util.HashMap;
import java.util.Map;

import static java.util.stream.StreamSupport.stream;


public class ComparingByKey {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Anna");
        map.put(101, "Victoria");
        map.put(102, "Roger");
        //Returns a set view of the mappings contained in this map
        map.entrySet()
        //returns a sequential Stream with this collection as its source
        .stream()
                //sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByKey())

                .forEach(System.out::println);
    }
}
