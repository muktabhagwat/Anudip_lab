package multithreading;

/*Que3 - To display 20 terms of Fibonacci series.*/
public class FibonaciiSeries extends Thread
{

	public void run()
	{
		int first=0,second=1,next,i;
		System.out.println("Fibonacii Series");
		
		for(i=1;i<20;i++)
		{
			next=first+second;
		
			first=second;
			second=next;
			System.out.println(next);
		}
		System.out.println(" ");
	}

}
