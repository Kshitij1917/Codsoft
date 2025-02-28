import java.util.Scanner;
class BankAccount 
{
    private double balance;
    public BankAccount(double initialBalance)
    {
        this.balance = initialBalance;
    }
    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Deposit successful. New balance: $" + balance);
        } 
        else 
        {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }
    public void withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } 
        else if (amount > balance) 
        {
            System.out.println("Insufficient balance. Current balance: $" + balance);
        } 
        else 
        {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        }
    }
    public void checkBalance()
    {
        System.out.println("Current balance: $" + balance);
    }
}
class ATM 
{
    private BankAccount account;
    public ATM(BankAccount account) 
    {
        this.account = account;
    }
    public void displayMenu() 
    {
        System.out.println("\n----- ATM Menu -----");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }
    public void run() 
    {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do 
        {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    account.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
public class ATMSimulation 
{
    public static void main(String[] args) 
    {
        BankAccount userAccount = new BankAccount(1000.0);
        ATM atm = new ATM(userAccount);
        atm.run();
    }
}
