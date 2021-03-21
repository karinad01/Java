package Exercise;

import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Regexes
        String regexName = "[A-Za-z]";
        String regexDistance = "[0-9]";

        Pattern patternName = Pattern.compile(regexName);
        Pattern patternDistance = Pattern.compile(regexDistance);

        List<String> racers = Arrays.stream(scan.nextLine().split(", "))
                .collect(Collectors.toList());

        Map<String, Integer> racersDistance = new LinkedHashMap<>();
        racers.forEach(racer -> racersDistance.put(racer, 0));

        String input = scan.nextLine();
        while (!input.equals("end of race")) {
            //all letters -> name of racer
            //all digits -> the sum is the distance of the racer
            Matcher matcherName = patternName.matcher(input);
            String name = "";
            while (matcherName.find()) {
                name += matcherName.group();
            }
            int distance = 0;
            Matcher matcherDigits = patternDistance.matcher(input);
            while (matcherDigits.find()) {
                distance += Integer.parseInt(matcherDigits.group());
            }

            if (racersDistance.containsKey(name)) {
                racersDistance.put(name, racersDistance.get(name) + distance);
            }

            input = scan.nextLine();
        }

        List<String> firstThree = racersDistance.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("1st place: " + firstThree.get(0));
        System.out.println("2nd place: " + firstThree.get(1));
        System.out.println("3rd place: " + firstThree.get(2));

    }
}
