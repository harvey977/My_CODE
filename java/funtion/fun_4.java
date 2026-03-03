
//Decreasing Order
import java.util.Scanner;

public class fun_4 {
    public static void main(String[] args) {
        Scanner us = new Scanner(System.in);

        System.out.println("Enter the 3 numbers: ");
        int a = us.nextInt();
        int b = us.nextInt();
        int c = us.nextInt();

        des(a, b, c);
    }

    public static void des(int a, int b, int c) {
        // Using a more efficient method with if-else conditions
        if (a >= b && a >= c) {
            if (b >= c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        } else if (b >= a && b >= c) {
            if (a >= c) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        } else {
            if (a >= b) {
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(c + " " + b + " " + a);
            }
        }
    }
}
