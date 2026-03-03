import java.util.*;

public class sttr_7 {
    public static void main(String[] args) {
        Scanner us = new Scanner(System.in);
        System.out.println("Enter any name or word ");
        String s = us.nextLine();

        for (int i = s.length(); i > 0; i--) {
            System.out.println(s.substring(0, i));
        }

        for (int i = 2; i <= s.length(); i++) {
            System.out.println(s.substring(0, i));
        }
    }
}