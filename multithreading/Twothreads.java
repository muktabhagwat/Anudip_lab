package multithreading;
/*. Que1. Write a program that creates 2 threads - each displaying a message (Pass the message as a parameter to the constructor).
 *  The threads should display the messages continuously till the user presses ctrl+c.
*/
public class Twothreads 
{
	public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			try 
			{
				
				Display thread1=new Display("Hello");
				Display thread2=new Display("Mukta");
				
				//starting threads
				thread1.start();
				thread2.start();
				
				System.out.println("Please Enter ctrl+c...");
				while(true) 
				{
					Thread.sleep(100);
				}	
			}
			catch(InterruptedException e) 
			{
				System.out.println("Catch Exception");
			}
			
		}
}


