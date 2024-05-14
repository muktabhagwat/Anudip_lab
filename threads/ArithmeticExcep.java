package threads;
import java.util.*;
/*Q.1 Write a Java program that divides two numbers entered by the user.
Handle the ArithmeticException that may occur if the user attempts to divide by zero.*/
public class ArithmeticExcep {

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
			if(num1>0)
			{
				res=num1/num2;
				System.out.println("Division of two numbers");
			}
			else
			{
				throw new ArithmeticException("Divided by zero error");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occurs");
		}
	}

}
