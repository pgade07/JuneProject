package LogicalProgram;
import java.util.Scanner;
public class PrimeNoRange {

	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
		System.out.println("Enter your number range");
       int n= p.nextInt();
		for(int i=0;i<=n;i++)
		{
			int c =0;
			for(int j=2;j<=i;j++)
				{
				if(i%j==0)
				{c++;}}
		if(c==1)
		{System.out.print(" " +i);
		}}
	}
}
