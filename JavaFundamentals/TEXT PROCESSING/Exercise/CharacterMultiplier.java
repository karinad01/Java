package TextProcessing;

import java.math.BigInteger;
import java.util.*;


public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        long sum = 0;

        char[] firstWord = input[0].toCharArray();
        char[] secondWord = input[1].toCharArray();
        long tempSum = 0;
        int shorterWord = Math.min(firstWord.length,secondWord.length);
        int longestWord = Math.max(firstWord.length,secondWord.length);

        for (int i = 0; i < shorterWord; i++){
            tempSum=(int)firstWord[i]*(int)secondWord[i];
            sum += tempSum;
        }

        if(firstWord.length<secondWord.length){
            for (int i = shorterWord;i <= longestWord-1; i++){
                sum+=secondWord[i];
            }
        } else if (firstWord.length>secondWord.length){
            for (int i = shorterWord; i <= longestWord-1; i++){
                sum+=firstWord[i];
            }
        }

        System.out.println(sum);
    }
}