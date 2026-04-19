import java.util.Scanner;

class Shape {
    protected double d1, d2;

    public void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

class Triangle extends Shape {
    public double area() {
        return 0.5 * d1 * d2;
    }
}

class Rectangle extends Shape {
    public double area() {
        return d1 * d2;
    }
}
public class ShapeDemo {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dimensions (d1 and d2): ");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();

        Triangle t = new Triangle();
        t.getData(d1, d2);

        Rectangle r = new Rectangle();
        r.getData(d1, d2);

        System.out.println("Triangle Area: " + t.area());
        System.out.println("Rectangle Area: " + r.area());

        sc.close();
    }
}