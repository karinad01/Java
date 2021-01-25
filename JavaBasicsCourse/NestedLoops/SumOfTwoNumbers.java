import java.util.Scanner;

public class SumOfTwoNumbers {
		    public static void main(String[] args) {
		        Scanner scanner=new Scanner(System.in);
		        int start=Integer.parseInt(scanner.nextLine());
		        int finish=Integer.parseInt(scanner.nextLine());
		        int magicNumber=Integer.parseInt(scanner.nextLine());
		 
		        int counter=0;
		        boolean isCombinationFound=false;
		        outer:
		        for (int i = start; i <=finish ; i++) {
		            for (int j = start; j <=finish ; j++) {
		                counter++;
		                if(i+j==magicNumber){
		                    isCombinationFound=true;
		                    System.out.printf("Combination N:%d (%d + %d = %d)",counter,i,j,magicNumber);
		                    break outer;
		                }
		            }
		 
		        }
		 
		        if(!isCombinationFound){
		            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
		        }
		    }
		
}

