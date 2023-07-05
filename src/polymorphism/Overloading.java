package polymorphism;

public class Overloading {

	
	public void display() 
	{
		System.out.println("display1");
	}
	public void display(int a) 
	{
		System.out.println("display2");
	}
	public void display(int a, int b) 
	{
		System.out.println("display3");
	}
	public static void main(String[] args) {
		Overloading o=new Overloading();
		o.display();
		o.display(2);
		o.display(3,5);
	}

}
