import java.util.*;

class sttr_4 {
    public static void main(String[] args) {
        Scanner us = new Scanner(System.in);
        System.out.println("Enter any name or word ");
        String s = us.nextLine();
        int l = s.length();
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for (int j = 0; j < l; j++) {
            char ch = s.charAt(j);

            if (ch == 'A' || ch == 'a') {
                a++;
            } else if (ch == 'E' || ch == 'e') {
                e++;
            } else if (ch == 'I' || ch == 'i') {
                i++;
            } else if (ch == 'O' || ch == 'o') {
                o++;
            } else if (ch == 'U' || ch == 'u') {
                u++;
            }
        }

        System.out.println("Count of 'a': " + a);
        System.out.println("Count of 'e': " + e);
        System.out.println("Count of 'i': " + i);
        System.out.println("Count of 'o': " + o);
        System.out.println("Count of 'u': " + u);
    }
}
