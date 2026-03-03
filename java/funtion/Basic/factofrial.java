// factofrial


import java.util.*;
class factofrial{
	public static void main (String args[]){
	Scanner uk= new Scanner (System.in);
		
		System.out.println("how many number");
		int n=uk.nextInt();

		int i,f=1;
		for(i=1;i<=n;i++){
			f=f*i;
			System.out.println(i+" it is factofrial- "+ f);
		}
		System.out.println(n+" total - "+f);

	}
}
