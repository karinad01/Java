package Lab;
import java.util.Scanner;
public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int endValue = 0;
        boolean isTrue = false;
        for (int i = 1; i <= num; i++) {
            endValue = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
            isTrue = (sum == 5) || (sum == 7) || (sum == 11);
            if(isTrue) {
                System.out.printf("%d -> True%n", endValue);
            }else{
                System.out.printf("%d -> False%n", endValue);
            }
            sum = 0;
            i = endValue;

        }


    }
}
