import java.util.Scanner;

public class SpiceMustFlow {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startYield = Integer.parseInt(scan.nextLine());
        int totalYield = 0;
        int amount = 0;
        int days = 0;

        while (startYield > 0) {
            if (startYield < 100) {
                if (amount < 26) {
                    break;
                }
                amount -= 26;
                break;
            }
            amount += startYield - 26;
            startYield -= 10;

            days++;
        }
        System.out.println(days);
        System.out.println(amount);
    }
}
