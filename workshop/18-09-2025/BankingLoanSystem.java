import java.util.*;


abstract class Account {
    protected final String accountNumber; 
    protected double balance;
    protected String owner;

    public Account(String accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
    public void deposit(double amount) { balance += amount; }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public abstract void displayAccountType();
}


class SavingsAccount extends Account {
    public SavingsAccount(String accNo, String owner, double bal) {
        super(accNo, owner, bal);
    }
    public void displayAccountType() {
        System.out.println("Savings Account - " + accountNumber);
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(String accNo, String owner, double bal) {
        super(accNo, owner, bal);
    }
    public void displayAccountType() {
        System.out.println("Current Account - " + accountNumber);
    }
}

class Customer {
    private String name;
    private List<Account> accounts = new ArrayList<>();

    public Customer(String name) { this.name = name; }
    public String getName() { return name; }
    public void addAccount(Account acc) { accounts.add(acc); }
    public List<Account> getAccounts() { return accounts; }
}

interface LoanOperations {
    void approveLoan();
    double calculateEMI();
    void closeLoan();
}

class RepaymentSchedule {
    private int tenureMonths;
    private double monthlyEMI;

    public RepaymentSchedule(int tenureMonths, double monthlyEMI) {
        this.tenureMonths = tenureMonths;
        this.monthlyEMI = monthlyEMI;
    }

    public int getTenureMonths() { return tenureMonths; }
    public double getMonthlyEMI() { return monthlyEMI; }
}
abstract class Loan implements LoanOperations {
    protected static double baseInterestRate = 8.5; 
    protected Customer customer; 
    protected double principal;
    protected int tenureMonths;
    protected RepaymentSchedule repaymentSchedule;
    protected boolean active = false;

    public Loan(Customer customer, double principal, int tenureMonths) {
        this.customer = customer;
        this.principal = principal;
        this.tenureMonths = tenureMonths;
    }

    public void approveLoan() {
        active = true;
        double emi = calculateEMI();
        repaymentSchedule = new RepaymentSchedule(tenureMonths, emi);
        System.out.println("Loan Approved for " + customer.getName() + " | EMI: " + emi);
    }

    public void closeLoan() {
        active = false;
        System.out.println("Loan closed for " + customer.getName());
    }

    public RepaymentSchedule getRepaymentSchedule() { return repaymentSchedule; }

    public abstract double calculateEMI();
}
class HomeLoan extends Loan {
    public HomeLoan(Customer customer, double principal, int tenureMonths) {
        super(customer, principal, tenureMonths);
    }
    public double calculateEMI() {
        double rate = baseInterestRate - 1.0;
        double monthlyRate = rate / 12 / 100;
        return (principal * monthlyRate * Math.pow(1 + monthlyRate, tenureMonths)) /
                (Math.pow(1 + monthlyRate, tenureMonths) - 1);
    }
}

class CarLoan extends Loan {
    public CarLoan(Customer customer, double principal, int tenureMonths) {
        super(customer, principal, tenureMonths);
    }
    public double calculateEMI() {
        double rate = baseInterestRate + 0.5;
        double monthlyRate = rate / 12 / 100;
        return (principal * monthlyRate * Math.pow(1 + monthlyRate, tenureMonths)) /
                (Math.pow(1 + monthlyRate, tenureMonths) - 1);
    }
}

class PersonalLoan extends Loan {
    public PersonalLoan(Customer customer, double principal, int tenureMonths) {
        super(customer, principal, tenureMonths);
    }
    public double calculateEMI() {
        double rate = baseInterestRate + 2.0;
        double monthlyRate = rate / 12 / 100;
        return (principal * monthlyRate * Math.pow(1 + monthlyRate, tenureMonths)) /
                (Math.pow(1 + monthlyRate, tenureMonths) - 1);
    }
}

class AutoDebitSystem {
    public static void processEMI(Loan loan) {
        if (!loan.active) {
            System.out.println("Loan not active.");
            return;
        }

        double emi = loan.getRepaymentSchedule().getMonthlyEMI();
        boolean paid = false;

        for (Account acc : loan.customer.getAccounts()) {
            if (acc.withdraw(emi)) {
                System.out.println("EMI of " + emi + " deducted from " + acc.getAccountNumber());
                paid = true;
                break;
            }
        }

        if (!paid) {
            System.out.println("❌ Insufficient balance in all accounts for customer " + loan.customer.getName());
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Customer c1 = new Customer("Yash");

        Account acc1 = new SavingsAccount("SAV123", "Yash", 5000);
        Account acc2 = new CurrentAccount("CUR456", "Yash", 2000);
        c1.addAccount(acc1);
        c1.addAccount(acc2);

        Loan loan = new HomeLoan(c1, 100000, 12);
        loan.approveLoan();

        for (int i = 1; i <= 3; i++) {
            System.out.println("\nMonth " + i);
            AutoDebitSystem.processEMI(loan);
        }
    }
}
