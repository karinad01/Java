package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String resource = scan.nextLine();
        //resource -> quantity
        Map<String, Integer> resourcesQuantity = new LinkedHashMap<>();

        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scan.nextLine());
            //there is not a resource
            if (!resourcesQuantity.containsKey(resource)) {
                resourcesQuantity.put(resource, quantity);
            } else {
                resourcesQuantity.put(resource, resourcesQuantity.get(resource) + quantity);
            }

            resource = scan.nextLine();
        }
        resourcesQuantity.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
