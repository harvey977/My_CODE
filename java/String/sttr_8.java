import java.util.*;

public class sttr_8 {
    public static void main(String[] args) {
        Scanner us = new Scanner(System.in);
        System.out.println("Enter any name or word: ");
        String line = us.nextLine();
        line = line + " ";
        String word = "";
        char ch;
        int i, j;
        for (i = 0; i < line.length(); i++) {
            ch = line.charAt(i);
            if (ch != ' ') {
                word = word + ch;
            } else {
                for (j = word.length() - 1; j >= 0; j--) {
                    System.out.print("" + word.charAt(j));

                }
                word = "";
                System.out.print(" ");

            }
        }
    }
}