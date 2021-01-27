package ArraysLecture;

public class Demo8PrintingWithJoin {
    public static void main(String[] args) {
        String[] arr = {"one", "two", "me"};
        String bigString = String.join("*", arr);
        System.out.println(bigString);
    }
}
