package Lab;

public class SpecialNumberPrilojenie {
    public static void main(String[] args) {
        int i = 56;
        //print if n is special
        int number = i;
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        if (sum == 5 || sum == 7 || sum == 11) {
            System.out.println(i + " -> True");
        } else {
            System.out.println(i + " -> False");
        }

    }
}
