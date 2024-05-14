package multithreading;
//- To display 1 to 9999 in reverse order.
public class Reverse extends Thread
{
	public void run()
	{
		System.out.println("Reverse Order:");
		for(int i=9999;i>=1;i--)
		{
			System.out.println(i);
		}

	}
}
