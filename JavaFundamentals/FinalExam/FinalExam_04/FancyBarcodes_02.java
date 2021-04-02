package Exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String regex = "@#+(?<product>[A-Z][a-zA-Z0-9]{4,}[A-Z])@#+";
        Pattern patern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
        String barcode = scan.nextLine();
            Matcher matcher = patern.matcher(barcode);

            if (matcher.find()){
                String product = matcher.group("product");
                String prodGroup = "";

                for (int index = 0; index <= product.length()-1; index++) {
                    char curSymbol = product.charAt(index);

                    if(Character.isDigit(curSymbol)){
                        prodGroup += curSymbol;
                    }
                }

                if(prodGroup.equals("")){
                    System.out.println("Product group: 00");
                }else{
                    System.out.println("Product group: " + prodGroup);
                }
            }else{
                System.out.println("Invalid barcode");
            }
        }
    }
}
