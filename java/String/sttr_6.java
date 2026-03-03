import java.util.*;

class sttr_6 {
    public static void main(String[] args) {
        Scanner us = new Scanner(System.in);
        System.out.println("Enter any name or word ");
        String s = us.nextLine();

        for (int j = s.length(); j > 0; j--) {
            for (int i = 0; i < j; i++) {
                System.out.print(s.charAt(i));
            }
            System.out.println("");
        }
    }
}
