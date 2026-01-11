import java.util.Scanner;

class Practical4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double weightPound, heightInch;
          double weightKg, heightMeter, bmi;

        System.out.print("Enter weight in pounds: ");
          weightPound = sc.nextDouble();

        System.out.print("Enter height in inches: ");
          heightInch = sc.nextDouble();

        weightKg = weightPound * 0.45359237;
          heightMeter = heightInch * 0.0254;

        
        bmi = weightKg / (heightMeter * heightMeter);

        System.out.println("BMI = " + bmi);

        sc.close();
    }
}
