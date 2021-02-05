package Lab;
import java.util.Scanner;
public class RepeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String words = scan.nextLine();
        int n= Integer.parseInt(scan.nextLine());
        repeat(words,n);
    }

    private static String repeat(String words, int n) {

       String result = "";
        for (int i = 0; i < n; i++) {
            System.out.print(words);
        }
        return result;
    }
}
