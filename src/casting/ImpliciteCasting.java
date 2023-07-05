package casting;

public class ImpliciteCasting ///lower to higher datatype
{

	public static void main(String[] args) {
		
		//byte-short-Int-Long
		//float -double
		
		
		byte b=110;  //1 byte
		short c=b;    //2 byte
		
         System.out.println(c);
         
         int d=c;  //4 byte  
         System.out.println(d);
         
	}

}
