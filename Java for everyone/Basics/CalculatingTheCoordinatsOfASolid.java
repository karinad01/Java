package BasicsPage;

import static java.lang.Math.*;

public class CalculatingTheCoordinatsOfASolid {
    public static void main(String[] args) {

        final double g = 9.8; //free falling
        double alpha = 30; //horizon angle in grad
        double m = 0.1; //mass in kg
        double gamma = 0.1; //resistance in the air
        double v = 100.0; //velocity in m/s
        double t = 1.0; //time in sec
        double x, y; //coordinates in metres
        alpha /= 180 / PI;
        //calculating the coordinates
        x = v * m * cos(alpha) / gamma * (1 - exp(-gamma * t / m));
        y = m * (v * sin(alpha) * gamma + m * g) / gamma / gamma * (1 - exp(-gamma * t / m)) - m * g * t / gamma;
        System.out.println("Coordinates of the solid for t = " + t + " with:\nx=" + x + " m\ny=" + y + " m");
        System.out.println("Parameters:");
        System.out.println("Angle alpha = " + alpha / PI * 180 + " grad");
    }
}
