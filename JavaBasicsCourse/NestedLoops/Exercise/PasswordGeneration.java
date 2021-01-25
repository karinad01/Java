package Exercise;

import java.util.Scanner;

public class PasswordGeneration {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = Integer.parseInt(scan.nextLine());
		int l = Integer.parseInt(scan.nextLine());

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				for (int k = 97; k < 97 + l; k++) {
					char s1 = (char) k;
					for (int m = 97; m < 97 + l; m++) {
						char s2 = (char) m;
						for (int o = 1; o <= n; o++) {
							if (o > i && o > j) {
								System.out.printf("%d%d%c%c%d ", i, j, s1, s2, o);
								break;
							}
						}
					}
				}

			}
		}

	}

}
