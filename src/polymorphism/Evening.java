package polymorphism;

public class Evening extends Morning
{
	public void wish()
	{
		System.out.println("Good Evening");
	}
	  public void wish(int a)
	  {
		  System.out.println("Namaskar");
	  }
	  public static void main(String[] args)
	  {
		  Evening w=new Evening();
		       w.wish();
	           w.wish(0);
		  Morning m=new Morning();
				  m.wish();
		         m.wish(2);
	}
}
