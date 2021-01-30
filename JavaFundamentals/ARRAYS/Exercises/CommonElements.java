package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstRow = scan.nextLine();
        String secondRow = scan.nextLine();

        String[] words1 = firstRow.split(" ");
        String[] words2 = secondRow.split(" ");

        for (String word2 : words2) {
            for (String word1 : words1) {
                if(word2.equals(word1)){
                    System.out.print(word2 + " ");
                    break;
                }
            }
        }

    }
}

