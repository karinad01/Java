package Exercise;
import java.util.Scanner;
public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        String group = scan.nextLine();
        String day = scan.nextLine();
        double price = 0.0;
        switch (day) {
            case ("Friday"):
                if (group.equals("Students")) {
                    price = 8.45*num;
                    if(num>=30){
                       price = price-15*price/100;
                    }
                } else if (group.equals("Business")) {
                    if(num>=100){
                        num = num-10;
                    }
                    price = 10.90*num;
                } else if (group.equals("Regular")) {
                    price = 15*num;
                    if(num>=10 && num<=20){
                        price = price-5*price/100;
                    }
                }
                break;
            case("Saturday"):
                if (group.equals("Students")) {
                    price =9.80*num;
                    if(num>=30){
                        price = price-15*price/100;
                    }
                } else if (group.equals("Business")) {
                    if(num>=100){
                        num = num-10;
                    }
                    price = 15.60*num;
                } else if (group.equals("Regular")) {
                    price = 20*num;
                    if(num>=10 && num<=20){
                        price = price-5*price/100;
                    }
                }
                break;
            case("Sunday"):
                if (group.equals("Students")) {
                    price =10.46*num;
                    if(num>=30){
                        price = price-15*price/100;
                    }
                } else if (group.equals("Business")) {
                    if(num>=100){
                        num = num-10;
                    }
                    price = 16*num;
                } else if (group.equals("Regular")) {
                    price = 22.50*num;
                    if(num>=10 && num<=20) {
                        price = price - 5*price/100;
                    }
                }
                break;
        }
        System.out.printf("Total price: %.2f", price);
    }
}
