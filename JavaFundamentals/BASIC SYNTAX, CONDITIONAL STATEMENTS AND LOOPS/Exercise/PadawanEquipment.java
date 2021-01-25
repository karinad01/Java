package Exercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double amountMoney = Double.parseDouble(scan.nextLine());
        int countOfStudents = Integer.parseInt(scan.nextLine());
        double PriceLightsabres = Double.parseDouble(scan.nextLine());
        double PriceRobes = Double.parseDouble(scan.nextLine());
        double PriceBelts = Double.parseDouble(scan.nextLine());
        double freeBelts = countOfStudents-countOfStudents / 6;
        double total = PriceLightsabres * Math.ceil(1.1*countOfStudents) + PriceRobes * countOfStudents + PriceBelts *  freeBelts;


        if(total<=amountMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        }else {
            System.out.printf("Ivan Cho will need %.2flv more.",total - amountMoney);
        }
    }
}
