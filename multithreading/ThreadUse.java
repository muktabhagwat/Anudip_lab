package multithreading;

public class ThreadUse 
{

	public static void main(String[] args) 
	{
		Reverse r=new Reverse();
		FibonaciiSeries f=new FibonaciiSeries();
		
		System.out.println("Reverse order");
		r.start();
		System.out.println("Fibonacii Series");
		f.start();
	}

}
