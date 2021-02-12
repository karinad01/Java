package Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintingListsTwoWays {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six"));
        for (int index = 0; index < list.size(); index++) {
            System.out.printf("arr[%d] = %s%n", index, list.get(index));

        }

        //OR WITH STRING.join()
        List<String> list1 = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six"));
        System.out.println(String.join("; ", list1));
    }
}
