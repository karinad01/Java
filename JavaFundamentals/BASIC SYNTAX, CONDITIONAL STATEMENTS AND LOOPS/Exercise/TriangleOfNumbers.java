package ExerciseExamples;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int row = 1; row <= n; row++) {
            //колко пъти да печатам нещо
            for (int count = 1; count <= row; count++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
