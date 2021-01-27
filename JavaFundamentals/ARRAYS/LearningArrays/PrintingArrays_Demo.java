package ArraysLecture;

public class Demo7PrintingArraysOnConsole {
    public static void main(String[] args) {
        String[] arr = {"one", "two"};

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %s%n", i, arr[i]);
        }
    }
}
