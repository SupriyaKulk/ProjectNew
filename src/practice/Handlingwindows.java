package practice;

import java.util.Scanner;

public class Handlingwindows {
	
	public static void main(String[] args)
	{
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int N=scan.nextInt();
		
		int [] NK=new int[2];
		System.out.println("Enter the number of elements and rotation times");
		
		for(int i=0;i<2;i++)
		{	
			NK[i]=scan.nextInt();	
			
		}
		
		
		int[] A=new int[5];
		
		System.out.println("enter the elements");
		
		for(int j=0;j<5;j++)
		{
			
			A[j]=scan.nextInt();
			
		}
		System.out.println(A[0]);
		int len=A.length;
		for(int i=0;i<len-1;i++)
		{
			for(int j=0;j<len-1;j++)
			{
			int temp=A[len-1];
			A[i+1]=A[i];
			A[0]=temp;
			}
		}
		
		for(int i=0;i<len;i++)
		{
			System.out.print(A[i]);	
		}
	
		
		
	}

}
