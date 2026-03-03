import java.util.*;
import java.io.*;

public class s_b2 {
    public static void main(String[] args) {
        Scanner us = new Scanner(System.in);
        System.out.print("Enter any word -");
        String s = us.nextLine();
        int a = 0, e = 0, i = 0, u = 0, o = 0;

        for (int z = 0; z < s.length(); z++) {
            char ch = s.charAt(z);

            if (ch == 'a' || ch == 'A') {
                a++;
            } else if (ch == 'e' || ch == 'E') {
                e++;
            } else if (ch == 'i' || ch == 'I') {
                i++;
            } else if (ch == 'o' || ch == 'O') {
                o++;
            } else if (ch == 'u' || ch == 'U') {
                u++;
            }
        }

        System.out.println("A-" + a);
        System.out.println("E-" + e);
        System.out.println("I-" + i);
        System.out.println("O-" + o);
        System.out.println("U-" + u);
        // us.close();
    }
}