package abstraction;

public class BOIbank extends PersonalDetails
{

	@Override
	public void accountNo()
	{
		
		System.out.println("this is my BOI account number=7867583283");
	}
	
	
	public static void main(String[] args) 
	{
		BOIbank b=new BOIbank();
		b.accountNo();
	}

}
