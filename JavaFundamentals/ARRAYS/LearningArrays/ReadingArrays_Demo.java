package ArraysLecture;
import java.util.Scanner;
public class DemoReadingArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String[] names = new String[n];
        for (int i = 0; i < names.length; i++) {
            names[i] = scan.nextLine();
        }

    }
}
