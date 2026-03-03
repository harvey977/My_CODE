// prime no.


import java.util.*;
class prime_1{
	public static void main (String args[]){
	Scanner uk= new Scanner (System.in);
		
		System.out.println("which number to chack prime or not");
		int n=uk.nextInt();
		int i;
		boolean f=true;

			for(i=2;i<=Math.sqrt(n);i++){
				if(n%i==0){
				f=false;
				break;
				}
			}
		if(f==true){
			System.out.println("prime no.");
		}else{
			System.out.println("prime not no.");
		}
	}
}