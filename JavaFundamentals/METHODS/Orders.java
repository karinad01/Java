package Lab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());
        double price = 0.0;

        printPrice(product,quantity);
    }

    public static void printPrice(String product, int quantity){
       double price = 0.0;
       switch (product){
               case "coffee":
                   price = 1.5 * quantity;
                   break;
               case "water":
                   price = 1.00 * quantity;
                   break;
               case "coke":
                   price = 1.40 * quantity;
                   break;
               case "snacks":
                   price = 2.00 * quantity;
                   break;

       }


        System.out.printf("%.2f", price);
    }
}
