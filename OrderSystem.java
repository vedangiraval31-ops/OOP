import java.util.Scanner;

interface Order {
    void placeOrder(String item, int qty);
    void cancelOrder(int orderId);
    void generateBill();
}

abstract class PartialOrder implements Order {
    protected String item;
    protected int qty;
    protected int orderId;

    @Override
    public void placeOrder(String item, int qty) {
        this.item = item;
        this.qty = qty;
        this.orderId = (int)(Math.random() * 1000);

        System.out.println("Order Placed Successfully!");
        System.out.println("Order ID: " + orderId);
        System.out.println("Item: " + item + ", Quantity: " + qty);
    }
}

class FinalOrder extends PartialOrder {

    @Override
    public void cancelOrder(int orderId) {
        if (this.orderId == orderId) {
            System.out.println("Order " + orderId + " Cancelled Successfully.");
        } else {
            System.out.println("Invalid Order ID!");
        }
    }

    @Override
    public void generateBill() {
        int pricePerItem = 100; // fixed price for simplicity
        int total = qty * pricePerItem;

        System.out.println("\n----- BILL -----");
        System.out.println("Order ID: " + orderId);
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + qty);
        System.out.println("Total Amount: Rs. " + total);
    }
}

public class OrderSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FinalOrder order = new FinalOrder();

        System.out.println("Enter item name:");
        String item = sc.next();

        System.out.println("Enter quantity:");
        int qty = sc.nextInt();

        order.placeOrder(item, qty);

        System.out.println("\nChoose option:");
        System.out.println("1. Generate Bill");
        System.out.println("2. Cancel Order");

        int choice = sc.nextInt();

        if (choice == 1) {
            order.generateBill();
        } else if (choice == 2) {
            System.out.println("Enter Order ID:");
            int id = sc.nextInt();
            order.cancelOrder(id);
        } else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}