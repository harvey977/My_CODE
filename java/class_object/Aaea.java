
//1- area of circle 
//2- area of rectangle
//3- area of tangle
import java.util.*;

public class Aaea {

    // Circle:
    public double area(double r) {
        return 3.14 * r * r;
    }

    // Rectangle:
    public double area(double l, double w) {
        return l * w;
    }

    // Triangle:
    public double area(double b, double h, boolean tt) {
        if (tt) {
            return 0.5 * b * h;
        }
        return 0.0;
    }

    public static void main(String[] args) {
        Scanner us = new Scanner(System.in);
        Aaea ca = new Aaea();

        // Circle area
        System.out.print("circle:");
        System.out.print("Enter radius : ");
        double r = us.nextDouble();
        System.out.println("Area of circle: " + ca.area(r));

        // Rectangle area
        System.out.print("rectangle:");
        System.out.print("Enter length and width : ");
        double l = us.nextDouble();
        double w = us.nextDouble();
        System.out.println("Area of rectangle: " + ca.area(l, w));

        // Triangle area
        System.out.print("tangle:");
        System.out.print("Enter base and height : ");
        double b = us.nextDouble();
        double h = us.nextDouble();
        System.out.println("Area of triangle: " + ca.area(b, h, true));

        us.close();
    }
}
