package Exercise;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        int countRotations = Integer.parseInt(scan.nextLine());

        for (int rotation = 1; rotation <= countRotations; rotation++) {
            //take the first element
            //move all elements
            //the first element goes at the last position

            int firstNumber = numbers[0];
            for (int index = 0; index < numbers.length-1; index++) {
                numbers[index] = numbers[index+1];
            }
            numbers[numbers.length-1] = firstNumber;
        }
        for (int number:numbers) {
            System.out.print(number+ " ");
        }
    }
}
