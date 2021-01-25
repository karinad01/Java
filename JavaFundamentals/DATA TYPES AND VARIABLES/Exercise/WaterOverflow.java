package Exercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tankCapacity = 255;
        int n = Integer.parseInt(scan.nextLine());
int sum = 0;

        for (int i = 0; i < n; i++) {
            int litersOfWater = Integer.parseInt(scan.nextLine());
            sum+=litersOfWater;
            if (litersOfWater > tankCapacity) {
                System.out.println("Insufficient capacity!");
                sum-=litersOfWater;
            } else {
                tankCapacity -= litersOfWater;
            }
        }
        System.out.println(sum);
    }
}
