
//The Highest Common Factor(hcf)
import java.util.*;

public class fun_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int q = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int w = scanner.nextInt();

        int hcf = hh(q, w);
        System.out.println("The Highest Common Factor (HCF) is: " + hcf);

        scanner.close();
    }

    // Function to compute the HCF using the Euclidean algorithm
    public static int hh(int a, int b) {

        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Numbers must be non-negative.");
        }

        if (b == 0) {
            return a;
        }

        return hh(b, a % b);
    }
}
