package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] targets = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();


        String command = "";
        int counter = 0;

        while (!(command = scan.nextLine()).equals("End")) {
            int indexTarget = Integer.parseInt(command);

            if (indexTarget < targets.length && indexTarget >= 0) {

                for (int i = 0; i < targets.length; i++) {
                    int temp = targets[indexTarget];
                    if (targets[i] != -1 && i != indexTarget) {
                        if (targets[i] > temp) {
                            targets[i] -= temp;
                        } else if (targets[i] <= temp) {
                            targets[i] += temp;
                        }
                    }
                }
                targets[indexTarget] = -1;
                counter++;

            }

        }
        System.out.printf("Shot targets: %d -> ", counter);
        for (int element : targets) {
            System.out.printf("%d ", element);
        }
    }
}
