package Lab;
import java.util.Scanner;
public class ConcatNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = scan.nextLine();
        String second = scan.nextLine();
        String delimiter = scan.nextLine();

        String result = first+delimiter+second;
        System.out.println(result);
    }
}
