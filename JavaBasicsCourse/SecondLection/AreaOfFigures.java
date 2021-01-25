package lab;
import java.util.Scanner;
public class AreaOfFigures {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String shape = scan.nextLine();
		double s;
		
		if(shape.equals("square")) {
			double size = Double.parseDouble(scan.nextLine());
			s = size*size;
			System.out.printf("%.3f", s);
			
		}else if(shape.equals("rectangle")) {
			double size = Double.parseDouble(scan.nextLine());
			double size1 = Double.parseDouble(scan.nextLine());
			s = size*size1;
			System.out.printf("%.3f", s);
			
		}else if(shape.equals("circle")) {
			double size = Double.parseDouble(scan.nextLine());
			s = size*size*Math.PI;
			System.out.printf("%.3f", s);
			
		}else if(shape.equals("triangle")){
			double size= Double.parseDouble(scan.nextLine());
			double size1 = Double.parseDouble(scan.nextLine());
			s = size*size1/2;
			System.out.printf("%.3f", s);
			
		}
		
	}

}
