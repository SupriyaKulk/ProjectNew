package practice;

public class SecondLargest {
	
	public static void main(String[]args)
	{
		int[] array= {100,20,49,45,5,9,89,99};
		int largestnum=0;
		int secondLargest=0;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>largestnum)
			{
				
				secondLargest=largestnum;
				largestnum=array[i];
			}else  if(array[i]>secondLargest)
			{
				secondLargest=array[i];
				
			}
			
			
		}
		
		System.out.println(largestnum+"---:-largest number");
		
		System.out.println(secondLargest+"---:-second largest number");
	}

}
