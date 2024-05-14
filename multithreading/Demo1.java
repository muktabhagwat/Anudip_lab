package multithreading;
/*
Q. Write a program that creates 2 threads - each displaying a message (Pass the message as a parameter to the constructor). 
The threads should display the messages continuously till the user presses ctrl+c.*/
public class Demo1 extends Thread
{
	public void run()
	{
		System.out.println("This is run() method");
	}
	public static void main(String[] args)
	{
		Demo1 d=new Demo1();
		Demo1 d1=new Demo1();
		d.start();
		d1.start();
	}

}
