
//The Highest Common Factor(hcf)
import java.util.Scanner;

public class Fun6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        int hcf = findHCF(num1, num2);
        System.out.println("The HCF is: " + hcf);

        int lcm;
        lcm = ((num1 * num2) / hcf);j
        System.out.println("The LCM is: " + lcm);
    }

    // Function to compute the HCF using subtraction-based method
    public static int findHCF(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
