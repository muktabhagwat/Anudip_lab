package practice;

/*3)Write a program to accept choice from the user and perform the operation
1.Find out greater between 3 NO
2.Check given no is even or odd
3.Check the given character is vowel or not
4.check the given no is divible by 5 or not
*/
import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int age,choice,num1,num2,num3;
		
		System.out.println("\nEnter your choice for select gender\n1.Find out greater between 3 NO\r\n2.Check given no is even or odd\r\n3.Check the given character is vowel or not\r\n4.check the given no is divible by 5 or not\r\n5.Exit");
		choice=sc.nextInt();
		System.out.println("Enter the value 1");
		num1=sc.nextInt();
		System.out.println("Enter the value 2");
		num2=sc.nextInt();
		System.out.println("Enter the value 3");
		num3=sc.nextInt();
		switch(choice)
		{
		case 1://Find out greater between 3 NO
			/*
			 * int max = (num1>num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ?
			 * num2: num3); System.out.println("The greatest number: " + max);
			 */

			int maximum=num1;
			if(num1>=num2 && num1>=num3)
			{
				System.out.println("maximum number is num 1");
			}
			else if(num2>=num1 && num2>=num3)
			{
				System.out.println("maximum number is num2");
			}
			else if(num3>=num2 && num3>=num1)
			{
				System.out.println("maximum number is num3");
			}
			break;

		case 2://Check given no is even or odd
			int number=sc.nextInt();
			if(number%2==0)
			{
				System.out.println("Number is even");
			}
			else
				System.out.println("Nuber  is odd");
			break;
			

		case 3://Check the given character is vowel or not
			System.out.println("Enter the character");
			char character=sc.next().charAt(0);
			if(character=='a' || character=='e' || character=='i' || character=='o' || character=='u')
			{
				System.out.println("Character is Vowel");
			}
			break;

		case 4://check the given no is divible by 5 or not
			System.out.println("Enter the number");
			int num=sc.nextInt();
			if(num/5==0)
			{
				System.out.println("Number is divisible by 5");
			}
			else
				System.out.println("Number is not divisible by 5");
			break;
		case 5:
			System.exit(0);
		default:
			break;
			
		}
	}

}
