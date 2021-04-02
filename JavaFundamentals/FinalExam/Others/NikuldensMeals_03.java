package Exam;

import java.util.*;

public class NikuldensMeals_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> myMap = new TreeMap<>();
        int counterUnlike = 0;

        while (true) {
            String input = scan.nextLine();
            if (input.equals("Stop"))
                break;
            String[] tokens = input.split("-");
            String toCheck = tokens[0];
            String guest = tokens[1];
            String meal = tokens[2];

            switch (toCheck) {
                case "Like":
                    if (!myMap.containsKey(guest)) {
                        myMap.put(guest, new ArrayList<>());
                        myMap.get(guest).add(meal);
                    }else {
                        if (!myMap.get(guest).contains(meal))
                            myMap.get(guest).add(meal);
                    }
                    break;

                case "Unlike":
                    if (!myMap.containsKey(guest))
                        System.out.println(guest + " is not at the party.");
                    else {
                        if (myMap.get(guest).contains(meal)){
                            myMap.get(guest).remove(meal);
                            counterUnlike++;
                            System.out.println(guest + " doesn't like the " + meal + ".");
                        }else
                            System.out.println(guest + " doesn't have the " + meal + " in his/her collection.");
                    }
                    break;
            }
        }

        myMap.entrySet()
                .stream()
                .sorted((e1,e2) -> {
                    int lengthFirst = e1.getValue().size();
                    int lengthSecond = e2.getValue().size();
                    return Integer.compare(lengthSecond, lengthFirst);
                })
                .forEach(e -> {
                    System.out.print(e.getKey() + ": ");
                    System.out.print(String.join(", ", e.getValue()));;
                    System.out.println();
                });
        System.out.println("Unliked meals: " + counterUnlike);
    }
}