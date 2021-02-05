package Exercise;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(vowelsCount(input));
    }

    private static int vowelsCount(String input) {
        int vowelCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch1 = input.charAt(i);
             char lowCase = Character.toLowerCase(ch1);
            if (lowCase == 'a' || lowCase == 'e' || lowCase == 'i' || lowCase == 'o' || lowCase == 'u') {
                vowelCount++;
            }
        }
        return vowelCount;

    }
}
