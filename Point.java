import java.util.Scanner;

class Point {
    int x;
    int y;

    Point() {
        x = 5;
        y = 5;
    }

    Point(int a, int b) {
        x = a;
        y = b;
    }

    Point(Point p) {
        x = p.x;
        y = p.y;
    }

    void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Point p1 = new Point();
        p1.display();

        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();

        Point p2 = new Point(x, y);
        p2.display();

        Point p3 = new Point(p2);
        p3.display();
    }
}
