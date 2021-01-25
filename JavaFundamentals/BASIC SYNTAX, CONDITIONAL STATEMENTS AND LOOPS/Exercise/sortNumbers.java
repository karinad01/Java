package MoreExercises;

import java.util.Scanner;

public class sortNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1 = Double.parseDouble(scan.nextLine());
        double n2 = Double.parseDouble(scan.nextLine());
        double n3 = Double.parseDouble(scan.nextLine());

        double a;
        double b;
        double c;

        if(n1>n2){
            a=n1;
            c=n2;
        }else{
            a=n2;
            c=n1;
        }
        if(a>n3) {
            b = a;
            if (c > n3) {
                a = c;
                c = n3;
            } else {
                a = n3;
            }
        }else{
            b=n3;
            System.out.printf("%.0f%n",b);
            System.out.printf("%.0f%n",a);
            System.out.printf("%.0f",c);
        }
    }
}