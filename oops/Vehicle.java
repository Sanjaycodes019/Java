abstract class Vehicles {
    String brand;
    int speed;

    void displayInfo() {
        System.out.println("Name is " + brand + " | Speed: " + speed + " kmph");
    }

    abstract void start();
}

class Car extends Vehicles {
    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    @Override
    void start() {
        System.out.println("Car started");
    }
}

class Bike extends Vehicles {
    Bike(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    @Override
    void start() {
        System.out.println("Bike started");
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Bike b = new Bike("Bullet", 120);
        b.start();
        b.displayInfo();

        Car c = new Car("Fortuner", 100);
        c.start();
        c.displayInfo();
    }
}
