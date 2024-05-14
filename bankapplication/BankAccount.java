package bankapplication;
public class BankAccount implements Operation
{
    private String accountNumber;
    private String accountHolder;
    private double balance=2000;

    public BankAccount(String accountNumber, String accountHolder, double balance) 
    {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) 
    {
        balance += amount;
        System.out.println("Deposit successful. New balance: $" + balance);
    }

    public void withdraw(double amount)
    {
        if (amount > balance) 
        {
            System.out.println("Insufficient funds. Withdrawal unsuccessful.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        }
    }

    public void displayBalance()
    {
        System.out.println("Account Balance for " + accountHolder + ": $" + balance);
    }
}