class BankAccount {

    String accountId;
    String name;
    double balance;

    void assignValues(String id, String n, double b) {
        accountId = id;
        name = n;
        balance = b;
    }

    void displayValues() {
        System.out.println(accountId + " " + name + " " + balance);
    }

    public static void bank14() {

        BankAccount[] acc = new BankAccount[5];

        for (int i = 0; i < 5; i++) {
            acc[i] = new BankAccount();
        }

        acc[0].assignValues("A101", "Rahul", 5000);
        acc[1].assignValues("A102", "Priya", 6000);
        acc[2].assignValues("A103", "Amit", 7000);
        acc[3].assignValues("A104", "Neha", 8000);
        acc[4].assignValues("A105", "Karan", 9000);

        for (int i = 0; i < 5; i++) {
            acc[i].displayValues();
        }

        String searchId = "A103";

        for (int i = 0; i < 5; i++) {
            if (acc[i].accountId.equals(searchId)) {
                System.out.println("Account Found:");
                acc[i].displayValues();
            }
        }
    }

    public static void main(String[] args) {
        bank14(); // method call
    }
}