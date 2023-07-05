package practice;

public class ReversStringMy {

	public static void main(String[] args) {
		
		String  input = "selenium";
		char[] charArray =input.toCharArray();
		int start=1;
		int end=charArray.length-1;

		char temp;
		while (start<end){
		temp=charArray[start];
		charArray[start]=charArray[end];
		charArray[end]=temp;
		
		start++;
		end--;}
		System.out.println(charArray);
	}
}
