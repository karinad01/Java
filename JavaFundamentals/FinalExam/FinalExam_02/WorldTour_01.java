package Exercise;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder allStops = new StringBuilder(scan.nextLine());
        String command = scan.nextLine();

        while (!command.equals("Travel")) {
            String[] commandParts = command.split(":");
            switch (commandParts[0]) {
                case "Add Stop":
                    int insertIndex = Integer.parseInt(commandParts[1]);
                    String insertString = commandParts[2];

                    if (isValidIndex(allStops, insertIndex)) {
                        allStops.insert(insertIndex, insertString);
                    }
                    break;
                case "Remove Stop":
                    int fromIndex = Integer.parseInt(commandParts[1]);
                    int toIndex = Integer.parseInt(commandParts[2]);

                    if (isValidIndex(allStops, fromIndex) && isValidIndex(allStops, toIndex)) {
                        allStops.replace(fromIndex, toIndex + 1, "");
                    }
                    break;
                case "Switch":
                    String oldString = commandParts[1];
                    String newString = commandParts[2];

                        allStops = new StringBuilder(allStops.toString().replace(oldString, newString));

                    break;
                default:
                    System.out.println("Unknown command: " + command);
                    break;
            }
            System.out.println(allStops);
            command = scan.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + allStops);
    }

    static boolean isValidIndex(StringBuilder s, int index) {

        return index >= 0 && index < s.length();
    }
}
