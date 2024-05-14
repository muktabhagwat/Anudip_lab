package multithreading;

/*Q.Write a Java program which creates only one object.
	If user attempts to create second object, he should not be able to create it. (Using user defined Exception).*/
public class UserDefineEx 
{
	void num()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i +" ");
		}
	}
	public static void main(String[] args) 
	{
		UserDefineEx ud=new UserDefineEx();
		ud.num();
	}

}
