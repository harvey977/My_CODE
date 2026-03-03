// 1- input a no. 3 digit to and all digit cube then sum :-


import java.util.*;
class m_add{
	public static void main (String args[]){
		int n=321 , a , b, c, d;
		
		a=n%10;
		n=n/10;
		b=n%10;
		n=n/10;
		c=n%10;
		n=n/10;
		
		d=((a*a*a)+(b*b*b)+(c*c*c));
		
		System.out.println(d);
	}
}
		