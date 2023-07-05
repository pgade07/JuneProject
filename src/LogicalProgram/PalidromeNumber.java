package LogicalProgram;
import java.util.Scanner;
public class PalidromeNumber
{
  public static void main(String[] args) 
	{
		Scanner p=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=p.nextInt();
		System.out.println("Your number is:  "+n);
		int s=0;
		int t,r;
		r=n;
		while(n>0)
		{  
			t=n%10; //2511%10=1,251%10=1,  25%10=5   2/10=2
			s=s*10+t;//0*10+1=1, 10+1=11   11*10+5=110+5=115, 115*10+2=1150+2=1152
			n=n/10;  //2511/10=251, 251/10=25,  25/10=2
		}
		
  if(s==r) {	
	  System.out.println(s+"This is your palidrome number: ");
  }
  else {
	  System.out.println("\n\n"+s+ "This is not palidrome number");
	  p.close();}
	}
}
