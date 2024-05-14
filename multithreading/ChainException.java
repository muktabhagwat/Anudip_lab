package multithreading;
import java.util.Scanner;  

/*Que 3.Java program  of chained exceptions 
Q. Write a program to demonstrate the chained exception in Java.
*/
public class ChainException 
{
	public static void main(String[] args)
	{
		demo();
	}
	public static void demo()
	    {  
	    	
	        Scanner sc = new Scanner(System.in);  
	        System.out.print("Enter a positive Number: ");  
	     
	        int num = sc.nextInt();  
	        sc.close();  
	        try 
	        {  
	        	if (num < 0) 
	            {  
	                throw new IllegalArgumentException("Number must be positive");  
	            }  
	            int result = 100 / 0;  
	            System.out.println("Result: " + result);  
	        }
	        
	        catch (IllegalArgumentException e) 
	        {  
	            throw new RuntimeException("Invalid Input", e);  
	        } 
	        catch (ArithmeticException e) 
	        {  
	            throw new RuntimeException(" divide by zero error", e);  
	        }  
	    }  
	}  
