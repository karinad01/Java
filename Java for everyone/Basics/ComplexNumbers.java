package BasicsPage;
import static java.lang.Math.*;
public class ComplexNumbers {
    public static void main(String[] args) {
        double x= 1.0, y=-1.0;
        int n = 5;
        double r,phi;
        double Re,Im;
        r = sqrt(x*x+y*y);
        phi=atan2(y,x);
        Re=pow(r,n)*cos(n*phi);
        Im = pow(r,n)*sin(n*phi);
        System.out.println("Re="+Re);
        System.out.println("Im="+Im);
    }
}
