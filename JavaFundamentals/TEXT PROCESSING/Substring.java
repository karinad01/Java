package TextProcessing;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String removeWord = scan.nextLine();
        String text = scan.nextLine();

        int index = text.indexOf(removeWord);

        while(index != -1){
            text = text.replace(removeWord, "");
            index = text.indexOf(removeWord);
        }
        System.out.println(text);
    }
}
