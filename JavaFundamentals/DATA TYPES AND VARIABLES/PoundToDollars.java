package Lab;
import java.util.Scanner;
public class PoundToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pounds = Double.parseDouble(scan.nextLine());
        double exchangeCourse = 1.31;
        double dollars = pounds * exchangeCourse        ;
        System.out.printf("%.3f", dollars);
    }
}
