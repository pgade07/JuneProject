package LogicalProgram;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
	    {
	    	int c;
	    	Scanner dc=new Scanner(System.in);
	    	System.out.println(" print values of a & b");
	    	int a=dc.nextInt();
	    	int b=dc.nextInt();
	    	
	    	c=a;  //a=25, b=35//25
	    	a=b;  //25=35
	    	b=c;  //35=25
	    	System.out.println("values of a after swapping is  " +a+ "\n value of b after swapping is  " +b);
	    	dc.close();
	        }
	    }

	}


