package Exercise;

import java.util.Scanner;

public class CharctersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char input1 = scan.nextLine().charAt(0);
        char input2 = scan.nextLine().charAt(0);

        printASCIIValues(input1, input2);
    }

    private static void printASCIIValues(int input1, int input2) {
        int ch1 = input1;
        int ch2 = input2;

        if (ch1 < ch2) {
            for (int i = ch1 + 1; i < ch2; i++) {
                char result = (char) i;
                System.out.print(result + " ");
            }
        } else {
            for (int i = ch2+1; i < ch1; i++) {
                char result = (char) i;
                System.out.print(result+" ");

            }
        }

    }


}
