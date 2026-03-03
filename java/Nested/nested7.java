// nested7


import java.util.*;
class nested7{
    public static void main(String[] args) {
        int k = 5;
        int l = 1;

        for (int i = 1; i <= 11; i++) {
            
            for (int j = 1; j <= k; j++) {
                System.out.print(" ");
            }

            
            for (int j = 1; j <= l; j++) {
                System.out.print(j);
            }

             for (int j = l - 1; j >= 1; j--) {
                System.out.print(j);
            }

            
            if (i < 6) {
                k--;
                l++;
            } else {
                k++;
                l--;
            }

            
            System.out.println();
        }
    }
}