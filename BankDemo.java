import java.util.Scanner;

class BankAccount {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    public void openAccount(String accNo, String name, double initialDeposit) {
        this.accountNumber = accNo;
        this.accountHolderName = name;
        this.balance = initialDeposit;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
class SavingAccount extends BankAccount {
    private double interestRate = 0.04; // 4%

    public void calculateInterest() {
        double interest = balance * interestRate;
        System.out.println("Interest: " + interest);
    }
}
class FixedDepositAccount extends BankAccount {
    private int years;
    private double rate = 0.07; // 7%

    public void setDepositDetails(int years) {
        this.years = years;
    }

    public void maturityAmount() {
        double maturity = balance + (balance * rate * years);
        System.out.println("Maturity Amount after " + years + " years: " + maturity);
    }
}
public class BankDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SavingAccount sa = new SavingAccount();
        sa.openAccount("S101", "Rahul", 1000);

        sa.deposit(500);
        sa.withdraw(200);
        sa.checkBalance();
        sa.calculateInterest();

        System.out.println("------------------------");

        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount("F201", "Amit", 5000);

        fd.setDepositDetails(3);
        fd.checkBalance();
        fd.maturityAmount();

        sc.close();
    }
}