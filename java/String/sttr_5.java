import java.util.*;

class sttr_5 {
    public static void main(String[] args) {
        Scanner us = new Scanner(System.in);
        System.out.println("Enter any name or word ");
        String s = us.nextLine();

        for (int j = 0; j <= s.length(); j++) {
            for (int i = 0; i < j; i++) {
                System.out.print(s.charAt(i));
            }
            System.out.println("");
        }
    }
}
