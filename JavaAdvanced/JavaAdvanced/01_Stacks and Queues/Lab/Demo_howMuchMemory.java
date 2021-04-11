package Lab;

public class Demo_howMuchMemory {
    public static void main(String[] args) {

        int[] numbers = new int[32];

        System.out.println(numbers.length * Integer.BYTES);
    }
}
