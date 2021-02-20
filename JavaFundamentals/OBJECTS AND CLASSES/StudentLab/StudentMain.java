package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        List<Student> students = new ArrayList<>();

        while(!input.equals("end")){
            //reading the students
            String[] studentData = input.split(" "); //separate Strings
            String firstName = studentData[0];
            String lastName = studentData[1];
            int age = Integer.parseInt(studentData[2]);
            String city = studentData[3];

            Student student = new Student(firstName,lastName,age,city);
            students.add(student);

            input = scan.nextLine();

        }
        String filterCity = scan.nextLine();
        for (Student student:students) {
            if(student.getCity().equals(filterCity)){
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(),student.getAge());
            }
        }
        System.out.println();

    }
}
