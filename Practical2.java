import java.util.Scanner;

public class Practical2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c, d, e, f;
        double D, Dx, Dy;

        System.out.print("Enter a: ");
          a = sc.nextDouble();

        System.out.print("Enter b: ");
          b = sc.nextDouble();

        System.out.print("Enter c: ");
          c = sc.nextDouble();

        System.out.print("Enter d: ");
          d = sc.nextDouble();

        System.out.print("Enter e: ");
          e = sc.nextDouble();

        System.out.print("Enter f: ");
          f = sc.nextDouble();

        D = a * d - b * c;
        Dx = e * d - b * f;
        Dy = a * f - e * c;

        if (D == 0) {

             System.out.println("No solution possible");

        } else {
            System.out.println("x = " + (Dx / D));
            System.out.println("y = " + (Dy / D));
        }

        sc.close();
    }
}
