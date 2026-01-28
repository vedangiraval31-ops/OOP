class Rectangle {
    double width;
    double height;

    Rectangle() {
        width = 1;
        height = 1;
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        
        Rectangle obj1 = new Rectangle();
        System.out.println("Area: " + obj1.getArea());
        System.out.println("Perimeter: " + obj1.getPerimeter());

        Rectangle obj2 = new Rectangle(5, 3);
        System.out.println("Area: " + obj2.getArea());
        System.out.println("Perimeter: " + obj2.getPerimeter());
    }
}
