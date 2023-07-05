package incapusalation;

public class Test2
{
     private String name;
     public String getName()
	
     {return name;}
     public void setName(String name)
     {this.name=name;}
	
	public static void main(String[] args)
	{
		Test2 t=new Test2();
		t.setName("velocity");
         System.out.println(t.getName());
	}

}
