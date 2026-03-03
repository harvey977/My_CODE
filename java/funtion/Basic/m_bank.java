// 1- Bank cash System :-


import java.util.*;
class m_bank{
	public static void main (String args[]){
		int n=32545 , th, fh, tw, h, f, t, o;
		
		th=n/2000;
		n=n%2000;
		System.out.println("2000- "+th);

		fh=n/500;
		n=n%50;
		System.out.println("500- "+fh);
		
		tw=n/200;
		n=n%200;
		System.out.println("200- "+tw);

		h=n/100;
		n=n%100;
		System.out.println("100- "+h);

		f=n/50;
		n=n%50;
		System.out.println("50- "+f);

		t=n/10;
		n=n%10;
		System.out.println("10- "+t);

		o=n/1;
		n=n%1;
		System.out.println("1- "+o);
	}
}