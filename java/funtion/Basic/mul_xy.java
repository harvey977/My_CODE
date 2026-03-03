// X**Y


import java.util.*;
class mul_xy{
	public static void main (String args[]){
	Scanner uk= new Scanner (System.in);
		
		
	System.out.print("Enter x: ");
        int x=uk.nextInt();

        System.out.print("Enter y: ");
        int y=uk.nextInt();

        int p=1,s=0;
        

        for (int i=1; i<=y; i++) {
            p= p*x;
            s= s+p;
        }

        System.out.println(s);
		
	}
}