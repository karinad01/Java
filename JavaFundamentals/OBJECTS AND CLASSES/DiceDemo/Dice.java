import java.util.Random;

public class Dice {
    private int sides;

    public int getSides() {
        return sides;
    } //use this field

    public void setSides(int number) {
        if (number < 0) {
            sides = 1;
        }
        sides = number;
    } //set a new value to the field

    int roll() {
        Random random = new Random();
        int number = random.nextInt((sides) + 1);
        return number;
    }
}

