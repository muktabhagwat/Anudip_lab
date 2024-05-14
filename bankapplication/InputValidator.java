package bankapplication;

import java.util.Scanner;

class InputValidator 
{
    private static Scanner sc = new Scanner(System.in);

    public static String getValidAccountNumber() 
    {
    	
        System.out.print("Enter account number: ");
        String accountNumber = sc.nextLine();
        // Implement validation logic for account number if needed
        return accountNumber;
    }

    public static String getValidAccountHolderName() 
    {
        System.out.print("Enter account holder name: ");
        String accountHolder = sc.nextLine();
        // Implement validation logic for account holder name if needed
        return accountHolder;
    }

    public static double getValidInitialBalance() 
    {
        System.out.print("Enter initial balance: ");
        while (!sc.hasNextDouble())
        {
            System.out.println("Invalid input. Please enter a valid number.");
            System.out.print("Enter initial balance: ");
            sc.next(); // clear the invalid input
        }
        return sc.nextDouble();
    }
}
