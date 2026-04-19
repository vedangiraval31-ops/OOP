class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

    public Vehicle(String vehicleNumber, String brand, String fuelType) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.fuelType = fuelType;
    }

    public void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Vehicle No: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}
class Car extends Vehicle {
    protected int numberOfSeats;
    protected boolean acAvailable;

    public Car(String vehicleNumber, String brand, String fuelType,
               int numberOfSeats, boolean acAvailable) {
        super(vehicleNumber, brand, fuelType);
        this.numberOfSeats = numberOfSeats;
        this.acAvailable = acAvailable;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("AC Available: " + acAvailable);
    }
}
class ElectricCar extends Car {
    private int batteryCapacity;
    private int chargingTime;

    public ElectricCar(String vehicleNumber, String brand, String fuelType,
                       int numberOfSeats, boolean acAvailable,
                       int batteryCapacity, int chargingTime) {
        super(vehicleNumber, brand, fuelType, numberOfSeats, acAvailable);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("V101", "Generic", "Petrol");
        v1.displayDetails();

        System.out.println("----------------------");
        Car c1 = new Car("C202", "Toyota", "Diesel", 5, true);
        c1.displayDetails();

        System.out.println("----------------------");
        ElectricCar e1 = new ElectricCar("E303", "Tesla", "Electric", 4, true, 75, 1);
        e1.displayDetails();

        System.out.println("----------------------");
        Vehicle v2 = new Car("C404", "Honda", "Petrol", 5, false);
        v2.displayDetails(); // runtime polymorphism

        System.out.println("----------------------");
        if (v2 instanceof Car) {
            Car c2 = (Car) v2;
            System.out.println("Downcasted successfully:");
            System.out.println("Seats: " + c2.numberOfSeats);
            System.out.println("AC: " + c2.acAvailable);
        }
    }
}