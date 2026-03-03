// leap year :-


import java.util.*;
class palidroma{
	public static void main (String args[]){
		int n=12321;
		int m=n;
		
		int a=n%10;
		n=n/10;
		int b=n%10;
		n=n/10;
		int c=n%10;
		n=n/10;
		int d=n%10;
		n=n/10;
		int e=n%10;
		
		int o=(a*10000+b*1000+c*100+d*10+e);
		if(m==o){
			System.out.println("it is palidroma");
		}else{
			System.out.println("it is not palidroma");
		}
	}
}