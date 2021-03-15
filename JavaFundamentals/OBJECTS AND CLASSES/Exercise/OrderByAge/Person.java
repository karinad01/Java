package OrderByAge;

public class Person {
    private String name;
    private String personID;
    private int age;

    public Person(String name, String personID, int age) {
        this.name = name;
        this.personID = personID;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.", name, personID, age);

    }
}
