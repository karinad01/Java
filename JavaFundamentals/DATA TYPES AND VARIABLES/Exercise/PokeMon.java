import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pokePowerN = Integer.parseInt(scan.nextLine());
        int pokeTargetsM = Integer.parseInt(scan.nextLine());
        int exhaustionFactorY = Integer.parseInt(scan.nextLine());
        int currentPow = pokePowerN;
        int targets = 0;
        while (currentPow >= pokeTargetsM) {
            currentPow-=pokeTargetsM;
            targets++;

            if (currentPow == 50 * pokePowerN / 100 && exhaustionFactorY != 0) {
                    currentPow /= exhaustionFactorY;
            }


        }
        System.out.println(currentPow);
        System.out.println(targets);
    }
}
