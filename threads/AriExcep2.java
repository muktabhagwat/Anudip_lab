package threads;

import java.util.Scanner;

/*
Q.2 Write a Java method that takes two integers as input and returns their division result.
Handle the ArithmeticException that may occur if the second integer is zero. Write a JUnit test for this method*/
public class AriExcep2 {

	public static void main(String[] args) 
	{
		try
		{
			int num1,num2,res;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter First Number");
			num1=sc.nextInt();
			System.out.println("Enter Second Number");
			num2=sc.nextInt();
			res=num1/num2;
			if(num2>0)
			{
				throw new ArithmeticException("Divided by zero error");
				
			}
			else
			{
				System.out.println("Division of two numbers"+res);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occurs");
		}
	}

}
