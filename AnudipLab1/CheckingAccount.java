package AnudipLab1;

/*Q4)Create an interface called "BankAccount" with methods called "deposit" and "withdraw".
Create a class called "CheckingAccount" that implements the BankAccount interface and implements the "deposit" and "withdraw" methods.
Create an object of the CheckingAccount class and call both the "deposit" and "withdraw" methods.
1.Create a parent class called "Vehicle" with attributes such as brand, model, year, and a method called "drive".
Create a child class called "Car" that inherits from Vehicle and has an additional attribute called "color" and a method called "honk".
Create an object of the Car class and call both the "drive" and "honk" methods. 
*/

interface BankAccount 
{
	void deposite();	
	void withdraw();
}

public class CheckingAccount implements BankAccount
 {
	@Override
	public void deposite()
	{
		System.out.println("I am in CheckingAccount.deposite()");		
	}
	@Override
	public void withdraw()
	{
		System.out.println("I am in CheckingAccount.withdraw()");
	}
	public static void main(String[] args) 
	{
		CheckingAccount c=new CheckingAccount();
		c.deposite();
		c.withdraw();
	}
}
