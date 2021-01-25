import java.util.Scanner;

public class CinemaTicket {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int totalTicketsSold = 0;
		int studentTickets = 0;
		int kidsTickets = 0;
		int standardTickets = 0;

		while (!input.equals("Finish")) {
			String movieName = input;
			int seats = Integer.parseInt(scan.nextLine());
			String text = scan.nextLine();
			int soldTickets = 0;
			while (!text.equals("End")) {
				switch (text) {
				case "standard":
					standardTickets++;
					break;
				case "kid":
					kidsTickets++;
					break;
				case "student":
					studentTickets++;
					break;
				}
				soldTickets++;

				if (soldTickets >= seats) {
					break;
				}
				text = scan.nextLine();
			}
			totalTicketsSold += soldTickets;
			double roomFilled = soldTickets * 1.0 / seats * 100;
			System.out.printf("%s - %.2f%% full.%n", movieName, roomFilled);
			input = scan.nextLine();
		}
		double studentTicketsPercentage = studentTickets*1.0/totalTicketsSold*100;
		double kidsTicketsPercentage = kidsTickets*1.0/totalTicketsSold*100;
		double standardTicketsPercentage = standardTickets*1.0/totalTicketsSold*100;
		System.out.printf("Total tickets: %d%n%.2f%% student tickets.%n%.2f%% standard tickets.%n%.2f%% kids tickets.",totalTicketsSold,studentTicketsPercentage,standardTicketsPercentage,kidsTicketsPercentage);
	}

}
