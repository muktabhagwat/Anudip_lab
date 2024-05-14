package AnudipLab1;

public class Palindrome 
{

	void palindrome(int num)
	{
		int lastd,sum=0;
		int temp=0;
		num=temp;
		while(temp>0)
		{
			lastd=num%10;
			sum=lastd+sum*10;
			num=num%10;
		}
		if(temp==num)
		{
			System.out.println("Number is a Palindrome number");
		}
		else
		{
			System.out.println("Number is not Palindrome number");
		}	
	}

}
