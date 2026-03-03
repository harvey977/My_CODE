
//Decreasing Order
import java.util.Scanner;

public class fun_3 {
    public static void main(String[] args) {
        Scanner us = new Scanner(System.in);

        System.out.println("Enter the 3 numbers: ");
        int a = us.nextInt();
        int b = us.nextInt();
        int c = us.nextInt();
        des(a, b, c);
    }

    public static void des(int a, int b, int c) {
        if (a >= b && b >= c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a >= c && c >= b) {
            System.out.println(a + " " + c + " " + b);
        } else if (b >= a && a >= c) {
            System.out.println(b + " " + a + " " + c);
        } else if (b >= c && c >= a) {
            System.out.println(b + " " + c + " " + a);
        } else if (c >= a && a >= b) {
            System.out.println(c + " " + a + " " + b);
        } else { // c >= b && b >= a
            System.out.println(c + " " + b + " " + a);
        }
    }
}
