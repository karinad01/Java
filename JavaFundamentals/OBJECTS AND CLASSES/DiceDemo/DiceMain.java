
public class DiceMain {
    public static void main(String[] args) {
        Dice myDice = new Dice();
        myDice.setSides(10);
        System.out.println(myDice.getSides());
        System.out.println(myDice.roll());


    }
}
