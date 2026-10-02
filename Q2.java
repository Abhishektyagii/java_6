class Vehicle {

    void drive() {
        System.out.println("Vehicle is driving");
    }
}

class Car extends Vehicle {

    @Override
    void drive() {
        System.out.println("Repairing a car");
    }
}

public class Q2 {
    public static void main(String[] args) {

        Car car = new Car();

        car.drive();
    }
}