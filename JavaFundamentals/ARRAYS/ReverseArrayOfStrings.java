package ArraysLecture;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //read the array
        String[] input = scan.nextLine().split(" ");

        //reverse the array
        for (int i = 0; i < input.length / 2; i++) {
            String temp = input[i];
            input[i] = input[input.length - i - 1];
            input[input.length - i - 1] = temp;
        }

        //print the reverse array
        System.out.println(String.join(" ", input));
    }
}
