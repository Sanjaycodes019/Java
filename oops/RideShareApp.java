// Abstract class: Base blueprint for all vehicles
abstract class Vehicle {
    String driverName;
    int fuelLevel;
    Vehicle(String driver, int fuel) {
        this.driverName = driver;
        this.fuelLevel = fuel;
    }
    void refuel(int fuel) {
        fuelLevel += fuel;
        System.out.println(driverName + "'s vehicle refueled to " + fuelLevel + " liters.");
    }
    abstract void start(); // Must be implemented
    abstract void stop();  // Must be implemented
}
// Interfaces: Extra abilities
interface Flyable {
    void fly();
}

interface Sailable {
    void sail();
}
// Concrete class: Car (does not fly/sail)
class Car extends Vehicle {
    Car(String driver, int fuel) {
        super(driver, fuel);
    }
    @Override
    void start() {
        System.out.println(driverName + " starts the car.");
    }
    @Override
    void stop() {
        System.out.println(driverName + " stops the car.");
    }
}
// Concrete class: FlyingTaxi (Car + Flyable capability)
class FlyingTaxi extends Vehicle implements Flyable {
    FlyingTaxi(String driver, int fuel) {
        super(driver, fuel);
    }
    @Override
    void start() {
        System.out.println(driverName + " starts the flying taxi.");
    }
    @Override
    void stop() {
        System.out.println(driverName + " lands and stops the flying taxi.");
    }
    @Override
    public void fly() {
        System.out.println(driverName + " is flying the taxi!");
    }
}
// Concrete class: Boat (implements sailing)
class Boat extends Vehicle implements Sailable {
    Boat(String driver, int fuel) {
        super(driver, fuel);
    }
    @Override
    void start() {
        System.out.println(driverName + " starts the boat.");
    }
    @Override
    void stop() {
        System.out.println(driverName + " anchors the boat.");
    }
    @Override
    public void sail() {
        System.out.println(driverName + " is sailing the boat!");
    }
}
public class RideShareApp {
    public static void main(String[] args) {
        Car c = new Car("Ravi", 20);
        c.start();
        c.stop();
        FlyingTaxi f = new FlyingTaxi("Aman", 50);
        f.start();
        f.fly();
        f.stop();
        Boat b = new Boat("John", 30);
        b.start();
        b.sail();
        b.stop();
    }
}
