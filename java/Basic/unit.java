// unit for Bijli bill


import java.util.*;
class unit{
	public static void main (String args[]){
	Scanner uk= new Scanner (System.in);
		
		System.out.println("inter your unit");
		int n=uk.nextInt();

		int a=0;
		if(n<=100){
			System.out.println("total amount - "+a);
		}else if(n<=300){
			a=(n-100)*3;
			System.out.println("total amount - "+a);
		}else if(n<=500){
			a=(n-300)*5+600;
			System.out.println("total amount - "+a);
		}else if(n<=700){
			a=(n-500)*10+600+500+1000;
			System.out.println("total amount - "+a);
		}else {
			a=(n-700)*15+600+1000+1000+2000;
			System.out.println("total amount - "+a);
		}



	}
}