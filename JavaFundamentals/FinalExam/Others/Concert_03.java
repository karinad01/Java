package Exam;

import java.util.*;

public class Concert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> bandMembers = new LinkedHashMap<>();

        TreeMap<String, Integer> bandTime = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("start of concert")) {
            String[] tokens = input.split(";\\s+");
            String command = tokens[0];
            String bandName = tokens[1];
            if (command.equals("Add")) {
                if (!bandMembers.containsKey(bandName)) {
                    bandMembers.put(bandName, new ArrayList<>());

                }
                List<String> membersFromBand= bandMembers.get(bandName);
                String[] members = tokens[2].trim().split(", ");
                for (int i = 0; i < members.length; i++) {
                    if (!membersFromBand.contains(members[i])) {
                        membersFromBand.add(members[i]);
                    }
                }
            } else {
                bandTime.putIfAbsent(bandName, 0);
                int time = Integer.parseInt(tokens[2]);
                bandTime.put(bandName, bandTime.get(bandName) + time);
            }
            input = scanner.nextLine();
        }
        String bandCommand = scanner.nextLine();
        System.out.println();
        int totalTime = 0;
        for (Integer value : bandTime.values()) {
            totalTime += value;
        }
        System.out.println("Total time: " + totalTime);
        bandTime.entrySet().stream().sorted((a, b) -> {
            return b.getValue().compareTo(a.getValue());
        }).forEach(e -> System.out.printf("%s -> %d\n", e.getKey(), e.getValue()));


        System.out.println(bandCommand.trim());
        List<String> allMembers = bandMembers.get(bandCommand);
        for (String allMember : allMembers) {
            System.out.printf("=> %s\n", allMember);
        }

    }
}