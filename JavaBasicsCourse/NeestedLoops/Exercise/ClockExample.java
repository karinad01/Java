package Exercise;

public class ClockExample {

	public static void main(String[] args) {

		for (int h = 0; h < 24; h++) {
			for (int m = 0; m < 60; m++) {
				System.out.printf("%02d:%02d%n", h, m);
			}

		}

	}

}
