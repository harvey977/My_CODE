import java.util.Scanner;

class fun1 {

    String make;
    double price;

    public void sum(int a, int b) {
        int c = a + b;
        System.out.println("first Sum : " + c);
    }

    // Overloaded
    public void sum(int a, int b, int c) {
        int d = a + b + c;
        System.out.println("second Sum : " + d);
    }

    public static void main(String[] args) {
        Scanner us = new Scanner(System.in);

        // Input
        System.out.print("Enter first number: ");
        int a = us.nextInt();
        System.out.print("Enter second number: ");
        int b = us.nextInt();
        System.out.print("Enter third number: ");
        int c = us.nextInt();

        fun1 obj = new fun1();

        // overloaded
        obj.sum(a, b);
        obj.sum(a, b, c);
    }
}
