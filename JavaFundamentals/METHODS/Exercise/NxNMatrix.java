package Exercise;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        nxnMatrix(n);
    }

    private static void nxnMatrix(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <n ; j++) {
                System.out.print(n + " ");
            }
            System.out.println(n);
        }
    }
}
