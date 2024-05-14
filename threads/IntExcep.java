
 package threads;
	/* Q.3 Write a Java program that asks the user to enter an
	  integer. Handle the InputMismatchException that may occur if the user enters
	  something that is not an integer.*/
  
  import java.util.Scanner;
  
 public class IntExcep {
  
  public static void main(String[] args) throws InputMismatchException { try {
  
  
  int integer=0;
  
  boolean choice; Scanner sc=new Scanner(System.in);
  System.out.println("If you want to enter Integer then enter "+": yes");
  if(sc.nextLine().equals("yes")) {
  System.out.println("Please Enter the Inrteger number"); integer=sc.nextInt();
  System.out.println("You entered Integer : " + integer); }
 
  else { System.out.println("You chose not to enter an integer."); }
 
  } finally { System.out.println(" "); }
  
 } }
 