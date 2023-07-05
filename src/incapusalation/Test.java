package incapusalation;

public class Test 
{
      private double balance;
      public void setbalance(double balance)
      {
    	  this.balance=balance;
    	  System.out.println(balance);
      }
      public double getBalance()
      {
    	  return balance;  
      }
	
	public static void main(String[] args)
	{Test t=new Test ();
	    t.setbalance(1000);
	    //t.getBalance();
	   // double z=t.getBalance();
		//System.out.println(z);
}

}
