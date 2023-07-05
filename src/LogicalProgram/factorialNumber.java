package LogicalProgram;

import java.util.Scanner;

public class factorialNumber {

	public static void main(String[] args) {
	Scanner pg=new Scanner(System.in);
	System.out.println("Enter your factoration number");
	int n=pg.nextInt();
	System.out.println("your entered value is:   "+n);
	int factorial =1;
	for(int i=1; i<=n; i++) 
	{
		factorial=factorial*i;
	}
	System.out.println("factorial of given no"+"  "+n+"is :  "+factorial);
	}
	
}
