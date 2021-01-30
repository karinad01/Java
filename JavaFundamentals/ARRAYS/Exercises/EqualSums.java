package Exercise;

import java.util.Scanner;
import java.util.Arrays;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        boolean isFound = false;
        for (int index = 0; index <= numbers.length - 1; index++) {
            //left sum of the numbers
            //right sum

            int sumLeft = 0; //0 - myindex -1 index
            int sumRight = 0; //myindex+1 to the last

            for (int indexLeft = 0; indexLeft <= index - 1; indexLeft++) {
                sumLeft += numbers[indexLeft];
            }

            for (int indexRight = index + 1; indexRight <= numbers.length - 1; indexRight++) {
                sumRight += numbers[indexRight];
            }

            if(sumLeft==sumRight){
                System.out.println(index);
                isFound = true;
            }
        }
        if(!isFound){
            System.out.println("no");
        }
    }
}
