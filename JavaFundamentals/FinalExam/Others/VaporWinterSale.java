package Exam;

import java.util.*;

public class VaporWinterSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");

        Map<String, Double> mapPrice = new HashMap<>();
        Map<String, Double> mapPriceDLC = new HashMap<>();

        for (String s : input) {
            if (s.contains("-")) {
                String[] game = s.split("-");
                String name = game[0];
                double price = Double.parseDouble(game[1]);

                mapPrice.putIfAbsent(name, price);


            } else if (s.contains(":")) {
                String[] game = s.split(":");
                String name = game[0];
                String dlc = game[1];
                if (mapPrice.containsKey(name)) {
                    mapPriceDLC.putIfAbsent(name + " - " + dlc, null);
                    mapPriceDLC.put(name + " - " + dlc, mapPrice.get(name) * 1.2);

                    mapPrice.remove(name);
                }
            }
        }

        mapPriceDLC.entrySet()
                .stream()
                .sorted(Comparator.comparingDouble(Map.Entry::getValue))
                .forEach(e -> {
                    mapPriceDLC.put(e.getKey(), e.getValue() * 0.5);
                    System.out.printf("%s - %.2f%n", e.getKey(), e.getValue());
                });

        mapPrice.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .forEach(e -> {
                    mapPrice.put(e.getKey(), e.getValue() * 0.8);
                    System.out.printf("%s - %.2f%n", e.getKey(), e.getValue());
                });
    }
}