package practice;

import java.util.Scanner;

public class primeOr {
	
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("e3nter the number");
		int num=scan.nextInt();
		
		boolean flag=false; 
		if(num==0||num==1)
		{
			System.out.println("No."+ num+" is not a prime number");
			
		}
		
		int i=2;
		while(i<=num/2)
		{
		 if(num%i==0)
		{
			flag=true;
			break;
		}
		 i++;
		}
		
		if(!flag)
		{
			System.out.println("Number "+num + "is prime number");
		}
		else
			
		{
			System.out.println("Number "+num + "is not a prime number");
			}
			}
	
		 
		
		
		
		
		
	}


