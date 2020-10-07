package practice;

public class IntegerPalindrome {
	
	public static void main(String[] args)
	{
		int num=121;
		int temp=num;
		int num2=0;
		
		while(num!=0)
		{
			
			int remainder=num%10;
			num2=num2*10+remainder;
			num=num/10;
		}
		
		System.out.print(temp);
		if(temp==num2)
		{
			System.out.print("the given string is palindrome");
		}
		else
		{
			System.out.print("The given String is not palindrome");
		}
	}


}
