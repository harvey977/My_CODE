import java.util.*;

public class s_b {
    public static void main(String args[]) {
        Scanner us = new Scanner(System.in);
        StringBuffer uk = new StringBuffer();

        System.out.print("Enter a sentence: ");
        String s = us.nextLine();

        String[] words = s.split(" ");
        if (words.length > 0) {
            words[0] = words[0].toUpperCase();
            words[words.length - 1] = words[words.length - 1].toUpperCase();
        }

        for (int i = 0; i < words.length; i++) {
            uk.append(words[i]);
            if (i < words.length - 1) {
                uk.append(" ");
            }
        }
        System.out.println(uk.toString());

    }
}