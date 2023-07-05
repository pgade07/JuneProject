package LogicalProgram;
import java.util.Scanner;
public class whileLoopPractice {
public static void main(String[] args)
{
	Scanner a=new Scanner(System.in);
		
		System.out.println("Enter your revers number");
		int n=a.nextInt();
        int t;
        int s=0;
        while(n>0)
      { t=n%10;
         s=s*10+t;
         n=n/10;
      }
        {
        	System.out.println("Revers number is: "+s);
        a.close();
        }
	}
}
