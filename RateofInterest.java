package AnudipLab1;
/*2)Write a program to accept age and gender from the user and check the ROI according to condition
above 60
M: 7%
F: 7.5%
below 60
M,F: 5%
eg( age : 20 G: M  ROI=7%)
*/
import java.util.Scanner;

public class RateofInterest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int age,choice;
		System.out.println("\nEnter your choice for select gender\n1: Male\n2:Female");
		choice=sc.nextInt();
		System.out.println("Enter the Age of person");
		age=sc.nextInt();
		if(choice==1)
		{ 
			if(age>=60)
			{
				System.out.println("Rate of interest for Male is=7%");
			}
			else
				System.out.println("Rate of interest is 5%");
			
		}
		else
		{
			if(age>=60)
			{
				System.out.println("Rate of interest for Female is=7.5%");
			}
			else
				System.out.println("Rate of interest is 5%");
			
		}
		sc.close();
}
}