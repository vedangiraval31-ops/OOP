
abstract class Vehicle {

    abstract String fuelType();
    abstract int noOfWheels();

    public void display() {
        System.out.println("Fuel Type: " + fuelType());
        System.out.println("Number of Wheels: " + noOfWheels());
    }
}

class Car extends Vehicle {

    @Override
    String fuelType() {
        return "Petrol/Diesel";
    }

    @Override
    int noOfWheels() {
        return 4;
    }
}

class Bike extends Vehicle {

    @Override
    String fuelType() {
        return "Petrol";
    }

    @Override
    int noOfWheels() {
        return 2;
    }
}

public class VehicleAbstractDemo {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bike = new Bike();

        System.out.println("---- CAR ----");
        car.display();

        System.out.println("\n---- BIKE ----");
        bike.display();
    }
}