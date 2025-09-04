
class BankAccount {
    public int accountNumber;      
    protected String accountHolder;  
    private double balance;         

   
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

   
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited. Updated Balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn. Updated Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
    }
}


class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsAccountDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number (public): " + accountNumber);   
        System.out.println("Account Holder (protected): " + accountHolder); 
        System.out.println("Balance (via getter): ₹" + getBalance());       
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("-----------------------------");
    }
}


public class BankAccountManagement {
    public static void main(String[] args) {
      
        BankAccount acc1 = new BankAccount(1001, "Rohit Sharma", 5000);
        acc1.displayAccountDetails();

        acc1.deposit(2000);
        acc1.withdraw(1500);
        System.out.println();

     
        SavingsAccount sa = new SavingsAccount(2002, "Yash Chaudhary", 10000, 4.5);
        sa.displaySavingsAccountDetails();

        
        sa.deposit(5000);
        sa.withdraw(3000);
    }
}
