// 1 :-no. for square and value are plus and use Math.pow


import java.util.*;
class ts{
	public static void main (String args[]){
		int n=456;
			
		int a=n%10;
		n=n/10;
		int b=n%10;
		n=n/10;
		int c=n%10;
	
		int q=a*a;
		int w=q%10;
		q=q/10;
		int e=q%10;
		double j=Math.pow(e,w);
		System.out.println(j);
	

		}
}