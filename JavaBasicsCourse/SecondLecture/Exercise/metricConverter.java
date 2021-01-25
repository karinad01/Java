package exercises.second;
import java.util.Scanner;
public class metricConverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num = Double.parseDouble(scan.nextLine());
		String metric = scan.nextLine();
		String metricConverted = scan.nextLine();
		
		double meterInCm = 100*num;
		double meterInMm = 1000*num;
		double mmInMeter = num/1000;
		double mmInCm = num/10;
		double cmInMm = num*10;
		double cmInMeter = num/100;
		
		
		if(metric.equals("mm") && metricConverted.equals("m")){
			System.out.printf("%.3f", mmInMeter);
		}else if(metric.equals("m")&& metricConverted.equals("cm")) {
			System.out.printf("%.3f",meterInCm);
		}else if(metric.equals("cm")&&metricConverted.equals("mm")) {
			System.out.printf("%.3f", cmInMm);
	}else if(metric.equals("mm")&&metricConverted.equals("cm")) {
		System.out.printf("%.3f", mmInCm);
	}else if(metric.equals("m")&&metricConverted.equals("mm")) {
		System.out.printf("%.3f",meterInMm);
	}else if(metric.equals("cm")&&metricConverted.equals("m")){
		System.out.printf("%.3f",cmInMeter);
	}
		
	}
}
