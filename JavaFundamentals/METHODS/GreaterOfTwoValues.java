package Lab;
import java.util.Scanner;
public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String value = scan.nextLine();
        String num1 = scan.nextLine();
        String num2 = scan.nextLine();

        if(value.equals("int")) {
            int n1 = Integer.parseInt(num1);
            int n2 = Integer.parseInt(num2);
            System.out.println(getMax(n1, n2));
        }

        if(value.equals("char") || value.equals("string")){
            System.out.println(getMax(num1,num2));
        }
    }

    private static int getMax(int num1, int num2) {
        if(num1>num2){
            return num1;
        }
        return num2;
    }

    static char getMax(char first, char second){
        if(first>second){
            return first;
        }
        return second;
    }

    static String getMax(String one, String two){
        if(one.compareTo(two) >= 0){
            return one;
        }
        return two;
    }
}
