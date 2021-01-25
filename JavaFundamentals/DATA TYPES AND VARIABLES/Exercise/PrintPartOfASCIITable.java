package Exercise;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        char start1 = (char) start;
        char end1 = (char) end;

        for (char i = start1; i <= end1; i++) {
            System.out.print(i+" ");
        }


    }
}
