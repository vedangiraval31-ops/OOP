class LoanCalculator {

    void calculateEMI(int principal, int time, float rate) {
        float monthlyRate = rate / (12 * 100); 
        int months = time * 12;
        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) /
                     (Math.pow(1 + monthlyRate, months) - 1);
        System.out.println("Home Loan EMI: Rs. " + String.format("%.2f", emi));
    }

    void calculateEMI(double principal, int time, double rate) {
        double monthlyRate = rate / (12 * 100); 
        int months = time * 12;
        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) /
                     (Math.pow(1 + monthlyRate, months) - 1);
        System.out.println("Vehicle Loan EMI: Rs. " + String.format("%.2f", emi));
    }

    void calculateEMI(int principal, int time) {
        float rate = 10.0f;
        float monthlyRate = rate / (12 * 100);
        int months = time * 12;
        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) /
                     (Math.pow(1 + monthlyRate, months) - 1);
        System.out.println("Personal Loan EMI (10% interest): Rs. " + String.format("%.2f", emi));
    }

    public static void main(String[] args) {
        LoanCalculator loan = new LoanCalculator();

        loan.calculateEMI(500000, 20, 7.5f); 

        loan.calculateEMI(800000.0, 5, 8.5); 

        loan.calculateEMI(100000, 2); 
    }
}
