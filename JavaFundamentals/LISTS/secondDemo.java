package Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class secondDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(10, 20, 30, 40, 50, 60, 70));

        numbers.add(7);
        System.out.println(numbers);


    }
}
