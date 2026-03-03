import java.util.Scanner;

public class fun_1 {
    public static void sum(int a, int b) {
        int c;
        c = a + b;
        System.out.println("Sum = " + c);
    }

    public static void main(String str[]) {
        Scanner us = new Scanner(System.in);
        System.out.println("Enter 1st no. : ");
        int x = us.nextInt();
        System.out.println("Enter 2nd no. : ");
        int y = us.nextInt();
        sum(x, y);

    }
}
