package AnudipLab1;

import java.util.Scanner;

/*
 * Q3)Design a class named ShowRoom with the following description: Instance
 * variables/data members: String name: to store the name of the customer. long
 * mobno: to store the mobile number of the customer. double cost: to store the
 * cost of the items purchased. double dis: to store the discount amount. double
 * amount: to store the amount to be paid after discount. Member methods:
 * ShowRoom(): default constructor to initialize data members. void input(): to
 * input customer name, mobile number, cost. void calculate(): to calculate
 * discount on the cost of purchased items, based on the following criteria:
 * COST DISCOUNT (IN PERCENTAGE) <=to Rs. 10000 5% > Rs. 10000 <=Rs. 20000 10% >
 * Rs. 20000 <= Rs. 35000 15% > Rs. 35000 20% void display(): to display
 * customer name, mobile number, amount to be paid after discount. Write a
 * main() method to create an object of the class and call the above member
 * methods.
 */
public class ShowRoom
{
	String cus_name;
	long cus_mobno;
	String pan_no;
	double cus_cost;
	double cus_discount;
	double cus_amount;

    ShowRoom()
	{
		cus_name=" ";
		cus_mobno=00;
		String pan_no=" ";
		cus_cost=00;
		cus_discount=00;
		cus_amount=00;
	}
    void input()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter customer name");
    	cus_name=sc.next();
    	System.out.println("Enter only 10 digit customer Mobile number");
    	//cus_mobno=sc.nextLong();
    	cus_mobno=enterno();
    	System.out.println("Enter customer cost of the items purchased");
    	cus_cost=sc.nextDouble();   	
    }
    long enterno()
    {
    	int count=0;
    	Scanner sc=new Scanner(System.in);
    	long temp=0;
    	while(count!=10)
    	{
    	  cus_mobno=sc.nextLong();
    	  temp=cus_mobno;
    	  while(temp!=0)
    	  {
    		  temp/=10;
    		  count ++;
    	  }
    	 }
    	return cus_mobno;	
	}/*
		 * void pan() { int count=0; Scanner sc=new Scanner(System.in); String temp;
		 * while(count!=10) {
		 * 
		 * pan_no=sc.nextLine(); temp=pan_no; if (IsDigit(pan_no)) {
		 * System.out.println("PAN number entered: " + panNumber); break; } else {
		 * System.out.println("Invalid PAN number. Please enter a valid PAN number:"); }
		 * int a=10; while(true) { temp.equals(a); count ++; } } }
		 */
    void calculate()
    {
    	if(cus_cost <=10000) //between 10000 or 10000
    	{
    		cus_discount=0.05*cus_cost;
    		cus_amount=cus_cost-cus_discount;
    	}
    	else if(cus_cost>10000 && cus_cost<=20000 )//greater than 10000
    	{
    		cus_discount=0.010*cus_cost;
    		cus_amount=cus_cost-cus_discount;
    	}
    	else if(cus_cost>20000 && cus_cost<=35000)
    	{
    		cus_discount=0.015*cus_cost;
    		cus_amount=cus_cost-cus_discount;
    	}
    	else
    	{
    		cus_discount=0.015*cus_cost;
    		cus_amount=cus_cost-cus_discount;
    		
    	}
    	System.out.println();
     	System.out.println("\nAmount to be paid After discount:"+cus_amount);
   
    }
    void display()
    {
      	
    	System.out.println("----------Bill Details--------");
    	System.out.println("------------------------------");
    	System.out.println("\nCustomer Name:\t\t"+cus_name+"\nCustomer Mob_No\t\t"+cus_mobno+"\nCustomer Items Cost\t"+cus_cost);
    }
	public static void main(String[] args)
	{
		 ShowRoom s=new ShowRoom();
		 s.input();
		 s.display();		
		 s.calculate();
	}

}
