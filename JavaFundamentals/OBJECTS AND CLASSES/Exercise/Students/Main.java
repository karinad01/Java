package Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Student> students = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String studentsData = scan.nextLine();
            String firstName = studentsData.split("\\s+")[0];
            String lastName = studentsData.split("\\s+")[1];
            double grade = Double.parseDouble(studentsData.split("\\s+")[2]);


            Student student = new Student(firstName, lastName, grade);
            students.add(student);
        }

        List<Student> sortedList = students.stream().sorted(Comparator.comparing(Student::getGrade).reversed())
                .collect(Collectors.toList());

        for (Student student:sortedList) {
            System.out.println(student);
        }
    }
}
