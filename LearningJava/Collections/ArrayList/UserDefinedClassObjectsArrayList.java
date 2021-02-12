package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class UserDefinedClassObjectsArrayList {
    public static void main(String[] args) {
        //creating user-defined class objects
        Student s1 = new Student(101, "Sue", 23);
        Student s2 = new Student(102, "Jack", 21);
        Student s3 = new Student(103, "Betty", 25);

        //creating arraylist
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(s1); //adding Student class object
        al.add(s2);
        al.add(s3);
        //Getting Iterator
        Iterator itr = al.iterator();
        //traversing elements of ArrayList objects
        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }


    }
}


class Student {
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}