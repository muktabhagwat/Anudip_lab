package multithreading;
/*Que2.Write a JAVA program which will generate the threads:*/
public class GenerateThread extends Thread
{
	//Runnable Interface
	public void run()
	{
		demo();
		System.out.println("This is run() method");
	}
	public static void demo()
	{
		System.out.println("This is Demo method");
	}

	public static void main(String[] args)
	{
		GenerateThread gen = new GenerateThread();

		GenerateThread gen1 = new GenerateThread();
		gen.start();
		gen1.start();
	}

}
