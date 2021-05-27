package SetsAndMaps;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countCompounds = Integer.parseInt(scan.nextLine());
        TreeSet<String> elements = new TreeSet<>();
        //ascending order -> TreeSet

        for (int compound = 1; compound <= countCompounds; compound++) {
            String chemicalCompound = scan.nextLine();
            //each chemical element -> add it in the set
            String[] chemicalElements = chemicalCompound.split("\\s+");
            //elements with the spacing

            //taking all elements from a collection and adding them in another collection
           //first way
            // elements.addAll(Arrays.asList(chemicalElements));
           //second way
            Collections.addAll(elements,chemicalElements);
        }
        for (String element:elements) {
            System.out.print(element + " ");

            //elements.forEach(e->System.out.print(element + " "));
        }
    }
}
