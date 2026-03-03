import java.util.*;

public class sttr_try_1 {
    public static void main(String[] args) {
        Scanner us = new Scanner(System.in);
        System.out.println("Enter any name or word: ");
        String line = us.nextLine();

        String word = "";
        char ch;
        for (int i = 0; i < line.length(); i++) {
            ch = line.charAt(i);
            if (Character.isLowerCase(ch)) {
                word += Character.toUpperCase(ch);
            } else if (Character.isUpperCase(ch)) {
                word += Character.toLowerCase(ch);
            }
        }
        System.out.println(word);
    }
}
