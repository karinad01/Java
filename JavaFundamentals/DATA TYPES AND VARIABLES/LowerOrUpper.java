package Lab;
import java.util.Scanner;
import java.lang.*;
import static java.lang.Character.isUpperCase;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char a = scan.nextLine().charAt(0);

        if (isUpperCase(a)) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }

    }

}