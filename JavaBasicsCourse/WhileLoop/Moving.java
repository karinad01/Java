import java.util.Scanner;

public class Moving {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w = Integer.parseInt(scan.nextLine());
		int l = Integer.parseInt(scan.nextLine());
		int h = Integer.parseInt(scan.nextLine());
		int totalVolume = w * l * h;

		String input = scan.nextLine();
		int sumOfBoxes = 0;
		boolean isAnyVolumeLeft = true;

		while (!input.equals("Done")) {
			int numberOfBoxes = Integer.parseInt(input);
			sumOfBoxes += numberOfBoxes;
			if (sumOfBoxes > totalVolume) {
				isAnyVolumeLeft = false;
				break;
			}

			input = scan.nextLine();
		}

		int result = Math.abs(totalVolume - sumOfBoxes);
		if (isAnyVolumeLeft) {
			System.out.printf("%d Cubic meters left.", result);
		}else {
			System.out.printf("No more free space! You need %d Cubic meters more.", result);
		}

	}

}
