package multithreading;

abstract class Lion implements Jungle
{

	void tree()
	{
		System.out.println("Lion.tree()");
	}//concrete method
	
	abstract void fruits();//abstract
	@Override
	public void run()
	{
		System.out.println("This is Lion class method");
	}
	
}
