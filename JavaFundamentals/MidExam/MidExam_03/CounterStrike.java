import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int energy = Integer.parseInt(scan.nextLine());
        int count = 0;
        boolean win = true;
        String command = scan.nextLine();
        while (!command.equals("End of battle")) {
            int neededEnergy = Integer.parseInt(command);

            if (energy < neededEnergy) {
                win = false;
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", count, energy);
                break;
            }
            count++;
            energy -= neededEnergy;

            if (count % 3 == 0) {
                energy += count;
            }

            command = scan.nextLine();
        }

        if (win) {
            System.out.printf("Won battles: %d. Energy left: %d", count, energy);

        }
    }
}
