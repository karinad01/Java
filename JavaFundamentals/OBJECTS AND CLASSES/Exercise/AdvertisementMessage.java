package AdvertisementMessage;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random randomMessage = new Random();

        for (int i = 1; i <= num; i++) {
            String message1 = phrases[randomMessage.nextInt(phrases.length - 1)];
            String message2 = events[randomMessage.nextInt(events.length - 1)];
            String message3 = authors[randomMessage.nextInt(authors.length - 1)];
            String message4 = cities[randomMessage.nextInt(cities.length - 1)];

            System.out.println(message1 + " " + message2 + " " + message3 + " - " + message4);
        }
    }
}
