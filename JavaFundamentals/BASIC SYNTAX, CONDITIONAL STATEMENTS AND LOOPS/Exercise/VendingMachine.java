package Exercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        double coinsSum = 0;
        double notValidCoins = 0;
        double validCoins = 0;
        double price = 0;
        double totalPrice = 0;
        boolean validProd = false;

        String product = "";

        while (true) {

            while (!command.equals("Start")) {
                double coins = Double.parseDouble(command);
                // coinsSum += validCoins;
                if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                    validCoins = coins;
                    coinsSum +=validCoins;
                } else {
                    notValidCoins = coins;
                    System.out.printf("Cannot accept %.2f%n", notValidCoins);
                }
                command = scan.nextLine();
            }
            product = scan.nextLine();
            if ("Nuts".equals(product)) {
                price = 2.0;
                validProd=true;
            } else if ("Water".equals(product)) {
                price = 0.7;
                validProd=true;
            } else if ("Crisps".equals(product)) {
                price = 1.5;
                validProd=true;
            } else if ("Soda".equals(product)) {
                price = 0.8;
                validProd=true;
            } else if ("Coke".equals(product)) {
                price = 1.0;
                validProd=true;
            } else if("End".equals(product)){
                break;
            } else {
                System.out.println("Invalid product");
            }
            if (coinsSum < price) {
                System.out.println("Sorry, not enough money");
            } else if(coinsSum>=price && validProd){
                System.out.printf("Purchased %s%n", product);
                coinsSum=coinsSum-price;

            }


        }
        System.out.printf("Change: %.2f", Math.abs(totalPrice-coinsSum));

    }
}
