package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingListsFirstWay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            list.add(number);
        }

    }
}
