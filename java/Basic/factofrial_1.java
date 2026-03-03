// factofrial


import java.util.*;
class factofrial_1{
	public static void main (String args[]){
	Scanner uk= new Scanner (System.in);
		
		System.out.println("how many number");
		int n=uk.nextInt();
		int f=1,s=1,i;
			for(i=3;i<=n;i+=2){
			f=i*(i-1)*f;
			s=s+f;
		}
		System.out.println(s);
	}
}