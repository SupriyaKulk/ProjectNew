package practice;

public class DuplicateCharinString {
	
	public static void main(String[] args)
	{
		String s="helloo";
		
		
		char[] chars=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			
			for(int j=i+1;j<s.length();j++)
			{
				if(chars[i]==chars[j])
				{
					System.out.println(chars[j]);
				
					break;
				}
			}
		}
	}

}
