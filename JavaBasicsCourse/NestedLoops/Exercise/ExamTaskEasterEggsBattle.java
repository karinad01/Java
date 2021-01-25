package Exercise;

import java.util.Scanner;

public class ExamTaskEasterEggsBattle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int player1 = Integer.parseInt(scan.nextLine());
		int player2 = Integer.parseInt(scan.nextLine());

		String line = scan.nextLine();

		while (!line.equals("End of battle")) {

			if (line.equals("one")) {

				player2--;
				if (player2 == 0) {
					System.out.printf("Player two is out of eggs. Player one has %d eggs left.", player1);
					break;
				}

			} else if (line.equals("two")) {
				player1--;

				if (player1 == 0) {
					System.out.printf("Player one is out of eggs. Player two has %d eggs left.", player2);
					break;

				}
			}
		

			line = scan.nextLine();
		}
		if(line.equals("End of battle")) {
		System.out.printf("Player one has %d eggs left.%nPlayer two has %d eggs left.", player1, player2);
	}
	}
}
