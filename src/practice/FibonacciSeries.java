package practice;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String [] args)
	{
		
		Scanner scan= new Scanner(System.in);
		System.out.println(" Enter the series number");
		int number=scan.nextInt();
		
		int [] Series=new int[number];
		
		Series[0]=0;
		Series[1]=1;
		for(int i=2;i<number;i++)
		{
			Series[i]=Series[i-1]+Series[i-2];
		}
	
	
	
		System.out.print(" The fibonnaci series is : " );
	
for(int i=0;i<number;i++)
{
		System.out.print(Series[i]+" " );
}	
	}
}
