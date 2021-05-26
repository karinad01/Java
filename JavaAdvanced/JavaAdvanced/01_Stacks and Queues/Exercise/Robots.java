package Exercise;

import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class demo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputRobots = scan.nextLine();
        String[] robotsData = inputRobots.split(";");

        LinkedHashMap<String, Integer> robots = getRobotsMap(robotsData);
        LinkedHashMap<String, Integer> robotWorkingTime = getRobotsWorkingTimeMap(robotsData);

        String startTime = scan.nextLine();
        //in seconds
        int startTimeInSeconds = timeInSeconds(startTime);

        ArrayDeque<String> products = new ArrayDeque<>();
        String product = scan.nextLine();

        while (!product.equals("End")) {
            products.offer(product);
            product = scan.nextLine();
        }

        while (!products.isEmpty()) {
            String currentProduct = products.poll();
            startTimeInSeconds++;
            //reduce the working time
            decreaseWorkingTime(robotWorkingTime);
            boolean isTaken = false;
            for (Map.Entry<String, Integer> robot : robotWorkingTime.entrySet()) {
                if (robot.getValue() == 0) {
                    //the robot is free
                    int takenTime = startTimeInSeconds;
                    System.out.println(robot.getKey() + " - " + currentProduct + " - " + getStartTime(startTimeInSeconds));
                    robotWorkingTime.put(robot.getKey(), robots.get(robot.getKey()));
                    isTaken = true;
                }
            }
            if (!isTaken) {
                products.offer(product);
            }
        }


    }

    private static void decreaseWorkingTime(LinkedHashMap<String, Integer> robotWorkingTime) {
        for (Map.Entry<String, Integer> robot : robotWorkingTime.entrySet()) {
            if (robot.getValue() > 0) {
                //they have worked one second on the product
                robotWorkingTime.put(robot.getKey(), robot.getValue() - 1);
            }
        }
    }

    private static LinkedHashMap<String, Integer> getRobotsWorkingTimeMap(String[] robotsData) {
        LinkedHashMap<String, Integer> robots = new LinkedHashMap<>();
        for (String robotData : robotsData) {
            String robotName = robotData.split("-")[0];
            robots.put(robotName, 0);

        }
        return robots;
    }

    private static int timeInSeconds(String startTime) {
        int hours = Integer.parseInt(startTime.split(":")[0]);
        int minutes = Integer.parseInt(startTime.split(":")[1]);
        int seconds = Integer.parseInt(startTime.split(":")[3]);
        int startTimeInSeconds = hours * 3600 + minutes * 60 + seconds;
        return startTimeInSeconds;
    }

    private static String getStartTime(int startTimeInSeconds) {
        //seconds in hours, minutes and seconds
        int hours = startTimeInSeconds / 3600;
        int minutes = startTimeInSeconds % 3600 / 60;
        int seconds = startTimeInSeconds % 60;
        return hours + ":" + minutes + ":" + seconds;
    }

    private static LinkedHashMap<String, Integer> getRobotsMap(String[] robotsData) {
        LinkedHashMap<String, Integer> robots = new LinkedHashMap<>();
        for (String robotData : robotsData) {
            String robotName = robotData.split("-")[0];
            int processingTime = Integer.parseInt(robotData.split("-")[1]);
            robots.put(robotName, processingTime);

        }
        return robots;
    }
}
