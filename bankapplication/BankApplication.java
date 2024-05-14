package bankapplication;

import java.util.Scanner;

public class BankApplication extends InputValidator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To our Bank Of Khodad....!!!");
        String accountNumber = InputValidator.getValidAccountNumber();
        String accountHolder = InputValidator.getValidAccountHolderName();
        double initialBalance = InputValidator.getValidInitialBalance();

        BankAccount account = new BankAccount(accountNumber, accountHolder, initialBalance);

        int choice;
      
        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the bank application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 4);

        sc.close();
    }
}


