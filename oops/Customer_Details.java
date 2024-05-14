package oops;

public abstract class Customer_Details extends Car_Details
{	
		public void details()         //Polymorphism(method override)         
		{
			System.out.println("Enter customer name: ");
			name=sc.next();
			System.out.println("Enter customer age: ");
			age=sc.nextInt();
			System.out.println("Enter customer phone number: ");
			setMobno(sc.nextLong());
			super.details();
		}
		
		abstract void services();
	}