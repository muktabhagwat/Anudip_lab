package multithreading;

public class ObjectCalling {

		static int count=0;
		ObjectCalling()throws ObjectException
		{
			if(count==0)
			{
				count++;
			}
			else
			{
				throw new ObjectException();
			}
		}
	}


