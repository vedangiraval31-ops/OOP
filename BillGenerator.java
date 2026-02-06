class BillGenerator {

    void generateBill(int itemTotal) {
        System.out.println("Customer Type: Regular");
        System.out.println("Final Bill Amount: Rs. " + itemTotal);
        System.out.println();
    }
    void generateBill(int itemTotal, int discount) {
        int finalAmount = itemTotal - discount;
        System.out.println("Customer Type: Privileged");
        System.out.println("Discount: Rs. " + discount);
        System.out.println("Final Bill Amount: Rs. " + finalAmount);
        System.out.println();
    }
    void generateBill(int itemTotal, double discountPercent) {
        double finalAmount = itemTotal - (itemTotal * discountPercent / 100);
        System.out.println("Customer Type: Festive Offer");
        System.out.println("Discount: " + discountPercent + "%");
        System.out.println("Final Bill Amount: Rs. " + finalAmount);
        System.out.println();
    }
    public static void main(String[] args) {
        BillGenerator bill = new BillGenerator();

        bill.generateBill(5000);          
        bill.generateBill(5000, 500);     
        bill.generateBill(5000, 10.0);    
    }
}
