// nested7_2 pascal triangle


import java.util.*;
class nested7_2{
    public static void main(String[] args) {
		int s=1,r=5;
	for(int i=1;i<=r;i++){
		for(int j=i; j<=r-1; j++){
			System.out.print(" ");
			
		}

		if(i==1){System.out.println(" "+s);
		}else{
			s=s*11;
			System.out.println(" "+s);
			}
		}
	}
}