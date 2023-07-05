package abstraction;

public class HDFCbank extends PersonalDetails
{
	@Override
	public void accountNo()
	{
		System.out.println("this my HDFC account=87655432211");	
	}
	public static void main(String[] args) 
	{ SBIbank s=new  SBIbank();
	     s.accountNo();
	     s.adharNo();
	     s.contactNo();
	     s.name();
	}


}
