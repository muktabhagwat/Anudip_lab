package practice;
import java.util.Scanner; 
public class Operator {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num1,num2,num3,ans,choice=0;
		System.out.println("Your choice:+\n1.Arithmetic Operator\n2.Relational Operator\n3.Logical operator\n4.Bitwise Opeartor\n5.Conditional operator\n6.Increment or decrement Operator\nEnter Your choice\n7.Exit");
	    choice=sc.nextInt();
		System.out.println("Enter the value 1");
		num1=sc.nextInt();
		System.out.println("Enter the value 2");
		num2=sc.nextInt();

		switch(choice)
		{
			case 1://Arithmetic operator
				ans=num1+num2;
				System.out.println("Addition of Two numbers"+ans);
				ans=num1-num2;
				System.out.println("Substaction of Two numbers"+ans);
				ans=num1*num2;
				System.out.println("Multiplication of Two numbers"+ans);
				ans=num1/num2;
				System.out.println("Dividation of Two numbers"+ans);
				ans=num1%num2;
				System.out.println("Modulus of Two numbers"+ans);
				
				
			case 2://Relational opearator
				if(num1==num2)
				{
					System.out.println("Num1 and Num2 are equal");
				}
				else if(num1!=num2)
					System.out.println("Num1 and Num2 are not equal");

				else if(num1>num2)
					System.out.println("Num1 is greater than Num2");
				else if(num1<num2)
					System.out.println("Num1 is less than Num2");
				else if(num1>=num2)
					System.out.println("Num1 is greater than or equal to Num2");
				else if(num1<=num2)
					System.out.println("Num1 is less than or equal to Num2");
				break;
			case 3://Logical operator
				if(num1<100 && num2>0)
				{
					System.out.println("num1 is less than 100 and num2 is greater than 0");
				}
				else if(num1%2==0 || num1>0)
					System.out.println("Num1 is even");

				else if (!(num1<num2))
					System.out.println("num1 is greater than num2");
				break;
			case 4://Bitwise Opeartor
				System.out.println("Num1 or num2="+(num1|num2));
				System.out.println("Num1 and num2="+(num1&num2));				
				System.out.println("Num1  compliment="+(~num1));
				System.out.println("Num2 shifted 2="+(num2<<2));
				System.out.println("Num2 shifted 2="+(num2>>2));
				break;
			case 5://Conditional operator
				System.out.println("number2 is less than number 1="+(num1>num2?num1:num2));
				break;
			case 6://Increment or decrement Operator
				System.out.println("Increment of num1::"+(num1++));
				System.out.println("Decrement of num2::"+(num2--));
				System.out.println("Pre-Increment of num1::"+(++num1));
				System.out.println("Pre-Decrement of num2::"+(--num2));
				break;
			case 7:
				System.exit(0);
			default:
				System.out.println("Pleases enter valid Choice");
				break;
		}
		sc.close();
	}

}


	


