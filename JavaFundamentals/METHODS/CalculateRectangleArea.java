package Lab;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double width = Integer.parseInt(scan.nextLine());
        double length = Integer.parseInt(scan.nextLine());
        double area = printArea(width, length);
        System.out.printf("%.0f", area);
    }

    private static double printArea(double width, double length) {
        return width * length;
    }
}
