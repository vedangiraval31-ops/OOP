import java.util.Scanner;

class VolumeCalculator {

    double calculateVolume(double side) {
        return side * side * side;
    }
    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }
    double calculateVolume(int radius) {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VolumeCalculator v = new VolumeCalculator();

        System.out.print("Enter side of cube: ");
        double side = sc.nextDouble();
        System.out.println("Volume of Cube: " + v.calculateVolume(side));

        System.out.print("Enter length width height of rectangular cube: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Volume of Rectangular Cube: " + v.calculateVolume(l, w, h));

        System.out.print("Enter radius of sphere: ");
        int r = sc.nextInt();
        System.out.println("Volume of Sphere: " + v.calculateVolume(r));
    }
}