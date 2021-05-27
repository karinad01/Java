package SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        LinkedHashSet<Integer> firstSet = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            firstSet.add(number);
        }

        for (int i = 0; i < m; i++) {
            int number = Integer.parseInt(scan.nextLine());
            secondSet.add(number);
        }
        //elements from the first and elements from the second set
        //we need the duplicate elements

        firstSet.retainAll(secondSet);
        //firstSet -> duplicate elements

        for (int number : firstSet) {
            System.out.print(number + " ");
        }
        //or another way of printing: firstSet.forEach(number -> System.out.print(number + " "));

    }
}
