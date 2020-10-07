package practice;

public class StringPalindrome {
	public static void main(String[] args)
	{
		String text="jenmbxc";
		
		String rever="";
		
		for(int i=text.length()-1;i>=0;i--)
		{
		rever=rever+text.charAt(i);
		}
		
		if(text.equals(rever))
		{
			System.out.print("the given string is palindrome");
		}
		else
		{
			System.out.print("The given String is not palindrome");
		}
	}

}
