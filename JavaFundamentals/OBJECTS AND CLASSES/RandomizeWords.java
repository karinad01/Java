package Lab;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] sentence = scan.nextLine().split(" ");

        Random index = new Random();
        for (int i = 0; i < sentence.length; i++) {
            //swapping two elements
            int randomIndex = index.nextInt(sentence.length);
            String temp = sentence[i];
            sentence[i] = sentence[randomIndex];
            sentence[randomIndex] = temp;
        }

        for (String word:sentence) {
            System.out.println(word);
        }

    }
}
