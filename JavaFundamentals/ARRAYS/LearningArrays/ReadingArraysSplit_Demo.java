package ArraysLecture;
import java.util.Scanner;
import java.util.Arrays;

public class Demo6ReadingArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputLine = "1 2 3 5 17";
        String[] items = inputLine.split("");

        int[] arr = Arrays.stream(items)
                .mapToInt(e -> Integer.parseInt(e)).toArray();
    }
}