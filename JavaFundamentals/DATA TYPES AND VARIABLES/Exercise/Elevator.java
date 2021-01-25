package Exercise;
import java.util.Scanner;
public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scan.nextLine());
        int capacityOfElevator = Integer.parseInt(scan.nextLine());

        int numberOfFullCourses = numberOfPeople/capacityOfElevator;

//        if(numberOfPeople%capacityOfElevator!=0){
//            numberOfFullCourses++;
//        }

        numberOfFullCourses = (int) Math.ceil ((double)numberOfPeople/capacityOfElevator);

        System.out.println(numberOfFullCourses);
    }
}
