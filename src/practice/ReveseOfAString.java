package practice;

public class ReveseOfAString {

	public static void main(String[] args) {
		
		String s="helloo";
		System.out.println("The given string is: "+ s);
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev= rev+s.charAt(i);
		}
		
		System.out.println("The reverse of a string in:"+ rev);
		

	}

}
