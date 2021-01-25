package Lab;
import java.util.Scanner;
public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            //special or not
            int number = i;
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number = number / 10;
            }
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.println(i + " -> True");
            } else {
                System.out.println(i + " -> False");
            }
        }

    }
}
