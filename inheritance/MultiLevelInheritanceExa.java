class Vehicle {
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

// Derived class
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

// Further derived class
class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric car is charging.");
    }
}

// Main class to test the multilevel inheritance
public class MultilevelInheritanceExa {
    public static void main(String[] args) {
        ElectricCar myElectricCar = new ElectricCar();
        myElectricCar.start();  // Inherited from Vehicle
        myElectricCar.drive();   // Inherited from Car
        myElectricCar.charge();  // ElectricCar's own method
    }
}