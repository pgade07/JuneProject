package LogicalProgram;
public class armstrongNumber {
public static void main(String[] args) {
		int a=370;    //(3*3*3)+(7*7*7)+(0)=370
		int b=a;      //370
		int d=0;
		while (d!=0) 
		{
			int c=b%10;  //370%10=0,  37%10=7         3%10=3
			d=d+c*c*c;  //0+0=0       0+7*7*7=343     343+3*3*3=370
		    b=b/10;    //370/10=37    37/10=3         3/10=0
		}
		if(d==a) 
		{
			System.out.println(a+"is an armstrong number");
		}
		else
		{
			System.out.println(a+"is not armstrong number");
		}
       }
	}
