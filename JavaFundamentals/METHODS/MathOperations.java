package Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1 = Double.parseDouble(scan.nextLine());
        String operator = scan.nextLine();
        double num2 = Double.parseDouble(scan.nextLine());
        System.out.println(new DecimalFormat("0.##").format(calculate(num1, operator, num2)));
    }

    private static double calculate(double num1, String operator, double num2) {
        double result = 0.0;

        switch (operator) {
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
        }
        return result;
    }
}
