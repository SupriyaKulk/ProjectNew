package practice;

public class SortingInAlphabet {

	public static void main(String[] args) {
		
		String S="good morning";
		
		char [] c=S.toCharArray();
		
		for(int i=0;i<c.length-1;i++)
		{
			for(int j=i+1;j<c.length-1;j++)
			{
				if(c[i]>c[j])
				{
					char temp=c[j];
					c[j]=c[i];
					c[i]=temp;
				}
						
			}
			
		}
		for(int i=0;i<c.length-1;i++)
		{
		System.out.print(c[i]);	
		}
		
	}

}
