package TextProcessing;

import java.util.Scanner;

public class ReverseString{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        String line=sc.nextLine();
        String toPrint="";

        while(!line.equals("end")){
            toPrint="";
            for(int i=line.length()-1;i>=0;i--){
                toPrint +=line.charAt(i);

                if(toPrint.length()==line.length()){
                    System.out.printf("%s = %s%n",line,toPrint);
                    break;
                }
            }
            line=sc.nextLine();
        }


    }
}