package exercises.second;
import java.util.Scanner;
public class worldSwimmingRecord {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double recordInSec = Double.parseDouble(scan.nextLine());
		double distanceInMeters = Double.parseDouble(scan.nextLine());
		double TimeSwimmingOneMeter = Double.parseDouble(scan.nextLine());
		
		double TimeSwimming = distanceInMeters*TimeSwimmingOneMeter;
		double resistance = Math.floor(distanceInMeters/15)*12.5;
		double TimeTotal = TimeSwimming + resistance;
		
		
	
		if(TimeTotal>=recordInSec) {
			double RecordNotReached = Math.abs(recordInSec - TimeTotal);
			System.out.printf("No, he failed! He was %.2f seconds slower.", RecordNotReached);
			
		}else if(recordInSec > TimeTotal){
			System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", TimeTotal);
		}
		
	}

}
