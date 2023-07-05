package abstraction;

public class SBIbank extends PersonalDetails
{
	
	public void accountNo() 
	{
		System.out.println("this my SBI account=2537899543");
		
	}
	
	public static void main(String[] args) 
	{ SBIbank s=new  SBIbank();
	     s.accountNo();
	     s.adharNo();
	     s.contactNo();
	     s.name();
	}

}
