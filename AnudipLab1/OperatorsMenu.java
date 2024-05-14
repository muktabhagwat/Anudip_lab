package AnudipLab1;
/*1)Write a program to accept choice from the user and display the output

1.Arithmetic operator

2.Logical Operator

3.Relational Operator

4.Bitwise Operator

5.Conditional Operator

6.Assignment Operator*/
import java.util.Scanner;
public class OperatorsMenu 
{
	    Scanner sc= new Scanner(System.in);
	    void AritmeticOpertor()
	    {
	        //Accepting inputs
	        System.out.println("Enter First number");
	        int num1=sc.nextInt();
	        System.out.println("Enter Second number");
	        int num2=sc.nextInt();
	        System.out.println("Enter operator out of these + - * % /");
	        char ch=sc.next().charAt(0);
	        switch(ch)
	        {
	            case '+': System.out.println("Addition "+num1+"+"+num2+"="+(num1+num2));
	            
	            case '-': System.out.println("Subtraction "+num1+"-"+num2+"="+(num1-num2));
	            
	            case '*': System.out.println("Multiplication  "+num1+"*"+num2+"="+(num1*num2));
	            
	            case '/': System.out.println("Division of "+num1+"/"+num2+"="+(num1/num2));
	            
	            case '%': System.out.println("Mod of "+num1+"%"+num2+"="+(num1%num2));
	        }
	    }
	    void LogicalOpertor()
	    {
	        System.out.println("Enter Fist number ");
	        int num1=sc.nextInt();
	        System.out.println("Enter Second number");
	        int num2=sc.nextInt();
	        System.out.println("Enter Third number");
	        int num3=sc.nextInt();
	        System.out.println("Enter choice \n1.Logical AND(&)\n2.Logical OR(||)\n3.Logical NOT(!)");
	        int ch=sc.nextInt();
	        switch(ch){
	            case 1:{
	                if ((num1 >= num2) && (num1 >= num3))//Logical and
	                    System.out.println(num1 + " is the largest number.");
	                else
	                    System.out.println(num1 + " is the smaller number than ."+num1+" & "+num2);
	            }
	            case 2:{
	                if (num1 > num2 || num2 == num3)//Logical or
	                    System.out.println("One or both are true");
	                else
	                    System.out.println("Both re false");
	            }
	            case 3:
	            {
	                if(!(num1==0))
	                    System.out.println("Number is not Zero");
	                else
	                    System.out.println("Number is Zero");
	            }
	            default :
	            	System.out.println("Invalid choice");
	        }
	    }
	    void RelationalOperator(){
	    	System.out.println("Enter Fist number ");
	        int num1=sc.nextInt();
	        System.out.println("Enter Second number");
	        int num2=sc.nextInt();
	        System.out.println("Enter choice \n1.>\n2.<\n3.>=\n4.<=\n5.==\n6)!=");
	        int ch=sc.nextInt();
	        switch(ch)
	        {
	            case 1:{
	                if ((num1>num2))
	                    System.out.println(num1 + " is the Greatest number.");
	                else
	                    System.out.println(num1 + " is the smaller number than ."+num1+" & "+num2);
	            }
	            case 2:{
	                if (num1 < num2 )
	                    System.out.println(num1+" less than "+num2);
	                else
	                    System.out.println(num1+" Not less than "+num2);
	            }
	            case 3:{
	                if ((num1>=num2))
	                    System.out.println(num1 + " is the greater than equal to "+num2);
	                else
	                    System.out.println(num1 + " is the smaller number than "+num1+" & "+num2);
	            }
	            case 4:{
	                if (num1 <= num2 )
	                    System.out.println(num1+" less than or equal "+num2);
	                else
	                    System.out.println(num1+" Not less than or equal "+num2);
	            }
	            case 5:{
	                if(!(num1==num2))
	                    System.out.println(num1+" is equal to "+num2);
	                else
	                    System.out.println(num1+" is NOT equal to "+num2);
	            }
	            case 6:{
	                if(!(num1!=num2))
	                    System.out.println(num1+" is Not equal to "+num2);
	                else
	                    System.out.println(num1+" is  equal to "+num2);
	            }
	            default :
	            	System.out.println("Invalid choice");
	        }
	    }
	    void BitwiseOperator()
	    {
	    	System.out.println("Enter Fist number ");
	        int num1=sc.nextInt();
	        System.out.println("Enter Second number");
	        int num2=sc.nextInt();
	        System.out.println("Enter choice \n1.&\n2.|\n3.^\n4.~\n");
	        int ch=sc.nextInt();
	        switch (ch)
	        {
	            case 1:System.out.println("num1 & num2 = " + (num1 & num2));
	            case 2: System.out.println("num1 | num2 = " + (num1 | num2));
	            case 3: System.out.println("num1 & num2 = " + (num1 ^ num2));
	            case 4: System.out.println("~ num2 = " + ( ~num2));
	            default :
	            	System.out.println("Invalid choice");     
	        }
	    }
	    void ConditionalOperator()
	    {
	        System.out.println("Enter First number");
	        int num1=sc.nextInt();
	        System.out.println("Enter Second number");
	        int num2=sc.nextInt();
	        System.out.println( (num1 == num2) ? num1: num2);
	    }
	    void AssignmentOperator(){

	    }
	    public static void main(String[] args) {
	       OperatorsMenu o= new OperatorsMenu();
	        Scanner sc= new Scanner(System.in);
	        while(true){
	            System.out.println("* *  MENU * * \n" +
	                    "1.Arithmetic operator\n" +
	                    "2.Logical Operator\n" +
	                    "3.Relational Operator\n" +
	                    "4.Bitwise Operator\n" +
	                    "5.Conditional Operator\n" +
	                    "6.Assignment Operator");
	            System.out.println("Enter your choice");
	            int ch=sc.nextInt();
	            switch (ch){
	                case 1: // arithmetic Operator function             
	                	o.AritmeticOpertor();
	                case 2://Logical operator 
	                	o.LogicalOpertor();
	                case 3 : // relational Operator function
	                	o.RelationalOperator();
	                case 4://  bitwise Operator function
	                	o.BitwiseOperator();
	                case 5:        // conditional Operator function
	                    o.ConditionalOperator();
	                case 6 :  //Assignment Operator function
	                    o.AssignmentOperator();
	                default : System.out.println("Enter valid case");
	            }
	        }
	    }
	}

