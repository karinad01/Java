package TextProcessing;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        StringBuilder encryptedSentence = new StringBuilder();

        for (int index = 0; index <= sentence.length() - 1; index++) {
            char currentSymbol = sentence.charAt(index);
            encryptedSentence.append((char) (currentSymbol + 3));

        }
        System.out.println(encryptedSentence.toString());
    }
}
