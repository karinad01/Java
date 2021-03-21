package Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarcode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Pattern pattern = Pattern.compile("%(?<customer>[A-Z][a-z]+)%[^$%|.]*<(?<product>\\w+)>[^$%|.]*\\|(?<quantity>\\d+)\\|[^$%|.]*?(?<price>\\d+\\.?\\d+)\\$");

        double sum = 0;

        while (!input.equals("end of shift")){
            Matcher matcher = pattern.matcher(input);

            if(matcher.find()){
            double totalPrice = Double.parseDouble(matcher.group("price")) * Integer.parseInt(matcher.group("quantity"));
                System.out.printf("%s: %s - %.2f%n", matcher.group("customer"), matcher.group("product"), totalPrice);
                sum += totalPrice;
            }
            input = scan.nextLine();
        }
        System.out.printf("Total income: %.2f",sum);
    }
}
