// prime no.


import java.util.*;
class prime{
	public static void main (String args[]){
	Scanner uk= new Scanner (System.in);
		
		System.out.println("which number to chack prime or not");
		int n=uk.nextInt();
		int t,i,c=0;
			for(i=1;i<=n;i++){
				if(n%i==0){
					c++;
				}
			}
		if(c==2){
			System.out.println("prime no.");
		}else{
			System.out.println("prime not no.");
		}
	}
}