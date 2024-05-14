package multithreading;

import java.io.IOException;
/*Que 3.Java program  of chained exceptions 
Q. Write a program to demonstrate the chained exception in Java.
*/


public class ChainedException
{
	public static void exception() throws Throwable 
	{
		 try 
	        {
	            throw new ArithmeticException("Top Level Exception.")
	              .initCause(new IOException("Input Output Cause."));
	        }
	        catch(ArithmeticException are) 
	        {
	            System.out.println("Exception  : " + are);
	            System.out.println("Actual cause: "+ are.getCause());
	        }
	}
    public static void main(String[] args) throws Throwable
    {
    	exception();
    }    
}