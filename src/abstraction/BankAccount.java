package abstraction;

public class BankAccount implements MasterCard 
{
	public void euro()
	{
          System.out.println("euro");
	}
	public void bankAccount()
	{
		System.out.println("bankAccount");
	}
	public void rupees()
	{
		System.out.println("rupees");
	}
	public void dollar()
	{
		System.out.println("dollar");
	}
	public void pounds()
	{
		System.out.println("pounds");
	}
	public void cash() 
	{System.out.println("cash");
	}
	public static void main(String[] args)
	{ BankAccount b= new BankAccount();
	    b.bankAccount();
	    b.cash();
	    b.euro();
	    b.dollar();
	    b.pounds();
	    b.rupees();
	    
	    CreditCard.thanks();
	}

}
