// X**Y


import java.util.*;
class mul_xy2{
	public static void main (String args[]){
	Scanner uk= new Scanner (System.in);
		
		
	System.out.print("Enter x: ");
        int x=uk.nextInt();

        System.out.print("Enter y: ");
        int y=uk.nextInt();

        int p=x,s=x;
        

        for (int i=1; i<=y; i++) {
            p= p*x*x;
            s= s+p;
        }

        System.out.println(s);
		
	}
}