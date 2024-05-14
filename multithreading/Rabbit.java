package multithreading;

public class Rabbit implements Jungle
{
	public static void main(String[] args) 
	{
		Rabbit r=new Rabbit();
		r.run();
	}

	@Override
	public void run() 
	{
		System.out.println("This is our Rabbit class run() method");	
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	

}
