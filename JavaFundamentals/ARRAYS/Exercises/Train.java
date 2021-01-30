package Exercise;
import java.util.Scanner;
import java.util.Arrays;
public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int wagons = Integer.parseInt(scan.nextLine());

       int[] arr = new int[wagons];
       int sum = 0;

        for (int i = 0; i < wagons; i++) {
            arr[i] = Integer.parseInt(scan.nextLine());
            sum+=arr[i];
            System.out.print(arr[i] + " ");

        }
        System.out.printf("%n%d", sum);
    }
}