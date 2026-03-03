//root

import java.util.*;

public class fun_2 {
    public static void root(int a) {

        System.out.println("root is :- " + Math.sqrt(a));
    }

    public static void main(String str[]) {
        Scanner us = new Scanner(System.in);
        System.out.println("Enter any no. : ");
        int x = us.nextInt();

        root(x);

    }
}
