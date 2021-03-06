package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        //product -> price*number
        Map<String, Double> productsPrice = new LinkedHashMap<>();
        Map<String, Integer> productsQuantity = new LinkedHashMap<>();

        while (!input.equals("buy")) {
            //Beer 2.20 100 -> split(" ")
            String product = input.split(" ")[0];
            double pricePerProduct = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);

            productsPrice.put(product, pricePerProduct);

            if (!productsQuantity.containsKey(product)) {
                productsQuantity.put(product, quantity);
            } else {
                productsQuantity.put(product, productsQuantity.get(product) + quantity);
            }

            input = scan.nextLine();
        }
        for (Map.Entry<String, Double> entry : productsPrice.entrySet()) {
            //multiply the price per quantity
            String productName = entry.getKey();
            double sum = entry.getValue() * productsQuantity.get(entry.getKey());
            System.out.printf("%s -> %.2f%n", productName, sum);
        }
    }
}
