package multithreading;

public class ObjectCreate {
  
		public static void main(String[] args)
		{
			try 
			{
				ObjectCalling o1=new ObjectCalling();
				System.out.println("First Object Created");
				ObjectCalling o2=new ObjectCalling();
				System.out.println("Second Object Created");
				ObjectCalling o3=new ObjectCalling();
				System.out.println("Third Object Created");
			}
			catch(ObjectException e)
			{
				System.out.println(e);
			}
		}
	}


