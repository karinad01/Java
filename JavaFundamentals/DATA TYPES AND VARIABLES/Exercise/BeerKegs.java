package Exercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String biggest = "";
        double max = 0.0;
        while (n-- > 0) {
            String model = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());
            double volume = Math.PI * radius * radius * height;

            if (volume > max) {
                max = volume;
                biggest = model;
            }
        }
        System.out.println(biggest);
    }
}
