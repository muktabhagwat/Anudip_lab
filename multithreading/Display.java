package multithreading;

public class Display extends Thread
{

	private String message;
		
		public Display(String message) 
		{
			this.message=message;
		}
		
		public void run() 
		{
			try 
			{
				while(true) 
				{
					System.out.println(message);
					Thread.sleep(100);
				}
			}
			catch(InterruptedException e) 
			{
				System.out.println("Catch Exception");
			}
		}
	}

