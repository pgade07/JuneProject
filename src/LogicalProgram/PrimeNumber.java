package LogicalProgram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=p.nextInt();
		
		System.out.println("Your number is:  "+n);
		if((n==0)||(n==1))
		{
			//a =1;
			System.out.println("this is composit number"+n);
			}else{int a = 0;
		for(int i=1; i<n; i++) 
			{
			 if (n%i==0) {
				a++; // a =1;
		    // break;
		   }}
		 if (a == 1) {
			 System.out.println("this number is prime");
		 }else
		 {
			 System.out.println("this number is not prime");
			 }
		 }}
		
}



