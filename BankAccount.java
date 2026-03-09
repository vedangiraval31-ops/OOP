class BankAccount {

    String accountHolderName;
    double balance;

    static double interestRate = 5.0;

    BankAccount(String name, double balance) {
        this.accountHolderName = name;
        this.balance = balance;
    }

    double calculateInterest() {
        return (balance * interestRate) / 100;
    }

    void displayInterest() {
        double interest = calculateInterest();
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + interest);
        System.out.println();
    }

    static void updateInterestRate(double newRate) {
        interestRate = newRate;
        System.out.println("Interest rate updated to: " + interestRate + "%");
    }

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Rahul", 10000);
        BankAccount acc2 = new BankAccount("Anita", 20000);

        acc1.displayInterest();
        acc2.displayInterest();

        BankAccount.updateInterestRate(6.5);

        acc1.displayInterest();
        acc2.displayInterest();
    }
}