package casting;

public class DownCasting extends UpCasting2

{   public void prisha()
	{
	System.out.println("BMW");
	}

	public static void main(String[] args)
	{
		//DownCasting D=new DownCasting(); 
		UpCasting2 U=new DownCasting();
		DownCasting D=(DownCasting)U;
		D.harish();
		D.harish1();
		D.prisha();
		
	}

}
