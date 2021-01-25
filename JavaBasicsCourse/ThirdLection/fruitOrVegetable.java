package Lab;
import java.util.Scanner;

public class fruitOrVegetable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String fruitOrVegetable = scan.nextLine();
		
		switch (fruitOrVegetable) {
		case "banana":
		case "apple":
		case "kiwi":
		case "cherry":
		case "grapes":
		case "lemon":
			System.out.println("fruit");
			break;
		case "tomato":
		case "cucumber":
		case "pepper":
		case "carrot":
			System.out.println("vegetable");
			break;

			default:
				System.out.println("unknown");
				break;
		}

	}

}
