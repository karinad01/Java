package Lab;

import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nameOfTown = scan.nextLine();
        long population = Integer.parseInt(scan.nextLine());
        int area = Integer.parseInt(scan.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.", nameOfTown, population, area);
    }
}
