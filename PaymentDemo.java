import java.util.Scanner;

class Payment {
    public void processPayment(int amount) {
        System.out.println("Processing payment of Rs. " + amount);
    }
}

class CreditCardPayment extends Payment {
    @Override
    public void processPayment(int amount) {
        System.out.println("Payment of Rs. " + amount + " done using Credit Card");
    }
}

class UPIPayment extends Payment {
    @Override
    public void processPayment(int amount) {
        System.out.println("Payment of Rs. " + amount + " done using UPI");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount:");
        int amount = sc.nextInt();

        System.out.println("Choose payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");

        int choice = sc.nextInt();

        Payment payment;

        if (choice == 1) {
            payment = new CreditCardPayment();
        } else if (choice == 2) {
            payment = new UPIPayment();
        } else {
            System.out.println("Invalid choice");
            sc.close();
            return;
        }
        payment.processPayment(amount);

        sc.close();
    }
}