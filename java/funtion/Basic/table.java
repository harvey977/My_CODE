// table


import java.util.*;
class table{
	public static void main (String args[]){
	Scanner uk= new Scanner (System.in);
		
		System.out.println("which table you need");
		int n=uk.nextInt();
		int t,i;
			for(i=1;i<=10;i++){
				t=i*n;
			System.out.println(n+"*"+i+"="+t);
		}
		
	}
}