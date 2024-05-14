package multilevelinheritance;
//21 December 2023
/*Write a program to do the process by using inheritance. create a class which will having the process of prime number  seriecheck the given no is palindrome number. 
Create another class which will check the given no is armstrong number or not .and also will display  following pattern generate below pattern

1      
121
12321
1234321
Multilevel Inheritance
*/
import java.util.*;

class PrimeNum
{
	int num,flag=0,i;
	Scanner sc=new Scanner(System.in);
	public void prime()
	{
		System.out.println("Enter the Number How many you want:");
		num=sc.nextInt();
		
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		
		if(flag==0)
			System.out.println(num+" number is prime");
		else
			System.out.println(num+" number is not prime");
	}
	
}

class Palindrome extends PrimeNum
{
	void palindrome() 
	{
	System.out.println("Enter the Number How many you want:");
	int num=sc.nextInt();
	int temp=num;
	int sum=0;
	while(temp!=0) 
	{
        sum=(sum*10)+temp%10;
        temp/=10;
	}
	if(sum==num) {
		System.out.println("Number is palindrome");
	}
	else {
		System.out.println("Number is not palindrome");
	}
	
}
}


class Pattern extends Palindrome
{
	void pattern() 
	{
		System.out.println("Enter the Number How many you want:");
		int row=sc.nextInt();
		for (int i = 1; i <= row; i++) {
		for(int k = 1; k <= i; k++) {
         System.out.print(k);
		}
		for (int l = i - 1; l >= 1; l--) {
          System.out.print(l);
		}
		System.out.println();
		}
}
}
class Armstrong extends Pattern
{

	protected void armstrong()
	{
		System.out.println("Enter the Number How many you want:");
		int num=sc.nextInt();
		int temp=num,count=0;
		
		while(temp!=0) {
			temp/=10;
			count++;
		}
		temp=num;
		int sum=0;
		while(temp!=0) {
			sum+=(int)Math.pow((int)(temp%10),count);
			temp/=10;
		}
		if(sum==num) {
			System.out.println("Number is Armstrong");
		}
		else {
			System.out.println("Number is NOT Armstrong");
		}
	}
}

class MultilevelInheritance extends Armstrong 
{

	void Check()
	{
		
		char Choice;
		Scanner sc= new Scanner(System.in);
		do
		{
			System.out.println("\n----Menu----"+"\n1]Prime number Check"+ "\n2]Check given number is Palindrome or not"+
		"\n3]Check given number Armstrong or not"+ "\n4]Generate Pattern");

			System.out.println("Enter your Choice:");
			int choice=sc.nextInt();
			switch(choice) 
			{
				case 1:prime();
				break;
				
				case 2:palindrome();
				break;
				
				case 3:armstrong();
				break;
				
				case 4:pattern();
				break;
				
				default:System.out.println("Enter valid choice");
			}
			System.out.println("Do you want to perform more operations y/n");
			Choice=sc.next().charAt(0);
			
		}while(Choice=='y' ||Choice=='Y');
		sc.close();
	}
	
	public static void main(String[] args) 
	{
		MultilevelInheritance m=new MultilevelInheritance();
		m.Check();
	}
}