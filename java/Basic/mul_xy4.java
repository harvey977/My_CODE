// X**Y


import java.util.*;
class mul_xy4{
	public static void main (String args[]){
	Scanner uk= new Scanner (System.in);
		
		
	System.out.print("Enter any number: ");
        int n = uk.nextInt();
               
        int sum = 0;
        int fact = 1;
        
        for (int i = 2; i <= n; i++) {
            fact = i * (i - 1);
            sum += fact;
        }
        
        System.out.println("The sum is: " + sum);

		
	}
}