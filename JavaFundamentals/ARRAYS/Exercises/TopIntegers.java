package Exercise;

import java.util.Scanner;
import java.util.Arrays;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //take a number from the array
        //check for all numbers after the taken number(index+1)

        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        //[1, 4, 3, 2]
        for (int i = 0; i <= numbers.length - 1; i++) {
           int number  = numbers[i];
            if(i == numbers.length-1){
               System.out.print(number);
               break;
           }
            boolean isBigger = false;
            for (int j = i + 1; j <= numbers.length - 1; j++) {
                if(number > numbers[j]){
                    isBigger = true;
                }else{
                    isBigger = false;
                    break;
                }
            }
            if(isBigger){
                System.out.print(number + " ");
            }
        }
    }
}
