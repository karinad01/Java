package OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<Person> person = new ArrayList<>();
         while(!input.equals("End")){
             String[] enter = input.split("\\s+");
             String name = enter[0];
             String personID = enter[1];
             int age = Integer.parseInt(enter[2]);

             Person currentPerson = new Person(name, personID,age);
             person.add(currentPerson);
             input = scan.nextLine();
         }
         List<Person> finalList = person.stream().sorted(Comparator.comparing(Person::getAge))
                 .collect(Collectors.toList());
        for (Person person1:finalList) {
            System.out.println(person1);
        }
    }
}
