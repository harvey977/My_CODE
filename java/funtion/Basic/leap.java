// leap year :-


import java.util.*;
class leap{
	public static void main (String args[]){
		int year=2040;
		
		if(year%400==0 && year%100==0){
			System.out.println("it is leap year");
		}else if(year%400!=0 && year%100==0){
			System.out.println("it is not leap year");
		}else if(year%4==0){
			System.out.println("it is leap year");
		}else{
			System.out.println("it is not leap year");
		}
	}
} 