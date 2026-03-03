// 2nd Greatest number :-


import java.util.*;
class G2_no{
	public static void main (String args[]){
		int a=1, b=2, c=3 ;
		if (a>b && a<c || a>c && b>a){
			
				System.out.println("a is 2nd greatest -"+ a);
			
		}
		else if (a>b && b>c || b<c && a<b){
			
				System.out.println(" is 2nd greatest -"+ b);
			
		}
		else {	System.out.println("c is 2nd greatest -"+ c);
			}
		

	}
}	