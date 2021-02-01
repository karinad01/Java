package Exercise;

import java.util.Scanner;
import java.util.Arrays;

public class Ladybugs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fieldSize = Integer.parseInt(scan.nextLine());
        int[] field = new int[fieldSize];

        int[] ladybugsIndexes = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        //indexes, where there's a ladybug in
        // 0 0 0 0

        for (int ladybugIndex : ladybugsIndexes) {
            if (ladybugIndex >= 0 && ladybugIndex <= field.length - 1) {
                field[ladybugIndex] = 1;
            }
        }

        String command = scan.nextLine();

        while (!command.equals("end")) {
            //0 right 1
            //0 starting index
            //right -> direction of movement
            //1 length of the movement
            String[] tokens = command.split(" ");
            int index = Integer.parseInt(tokens[0]);
            String direction = tokens[1];
            int flyLength = Integer.parseInt(tokens[2]);

            //there is flight if the index is in the array and on the index there is a ladybug
            if (index >= 0 && index <= field.length - 1 && field[index] == 1) {
                //the ladybug flies
                field[index] = 0;
                if (direction.equals("right")) {
                    index += flyLength; //new position
                    //IF..FLIES OR LANDS?
                    //is the position free or is it in the field?
                    //if there is not a ladybug on the field, or if there is no field anymore, then the ladybug stops flying
                    //stops flying: if the field is gone OR id there is no ladybug on the new position
                    //else: continues flying when it is on the field and the index is 1
                    while (index <= field.length - 1 && field[index] == 1) {
                        index += flyLength;
                    }
                    //STOPS FLYING
                    //not flying?
                    if (index <= field.length - 1) {
                        field[index] = 1;
                        //landing
                    }
                } else if (direction.equals("left")) {
                    index -= flyLength;
                    //stops flying: index<0 OR there is no ladybug on the index
                    //continues: if index >= 0 && there is a ladybug on the field
                    while (index >= 0 && field[index] == 1) {
                        index -= flyLength;
                    }
                    if (index >= 0) {
                        field[index] = 1;
                    }
                }
            }

            command = scan.nextLine();
        }

        for (int number : field) {
            System.out.print(number + " ");
        }
    }

}
