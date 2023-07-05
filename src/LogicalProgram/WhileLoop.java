package LogicalProgram;

public class WhileLoop {

	public static void main(String[] args) {
		int n=5211;
		int t;
		int s=0;
		while(n>0) 
		{
			t=n%10;    //5211%10= 1,  521%10=1,  52%10=2, 5%10=5
		   s=s*10+t;    //0*10+1=1,   1*10+1=10+1=11,  11*10+2=110+2=112  112*10+5=1120+5=1125
		   n=n/10;      //5211/10=521,  521/10=52,  52/10=5  ,5/10=0.5
		}
      System.out.println("revers number is :"+s);
	}
}
