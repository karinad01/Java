package TextProcessing;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalSum = 0;
        String input = scan.nextLine();
        String[] words = input.split("\\s+");

        for (String word : words) {
            double sumOfWord = getWordSum(word);
            totalSum += sumOfWord;
        }
        System.out.printf("%.2f", totalSum);
    }

    private static double getWordSum(String word) {

        double result = 0;
        char firstLetter = word.charAt(0);
        char secondLetter = word.charAt(word.length() - 1);
        double number = Double.parseDouble(word.substring(1, word.length() - 1));

        //firstLetter

        if (Character.isUpperCase(firstLetter)) {
            result = number / (firstLetter - 64);
            number = result;
        } else if (Character.isLowerCase(firstLetter)) {
            result = number * (firstLetter - 96);
            number = result;
        }

        //secondLetter
        if (Character.isUpperCase(secondLetter)) {
            result = number - (secondLetter - 64);
            number = result;
        } else if (Character.isLowerCase(secondLetter)) {
            result = number + (secondLetter - 96);
            number = result;
        }
        return result;
    }
}
