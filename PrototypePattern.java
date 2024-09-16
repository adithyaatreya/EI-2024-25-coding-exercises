// Prototype Interface
interface Vehicle extends Cloneable {
    Vehicle cloneVehicle();
}

// Concrete Prototypes
class Car implements Vehicle {
    @Override
    public Vehicle cloneVehicle() {
        return new Car();
    }

    @Override
    public String toString() {
        return "Car";
    }
}

class Motorbike implements Vehicle {
    @Override
    public Vehicle cloneVehicle() {
        return new Motorbike();
    }

    @Override
    public String toString() {
        return "Motorbike";
    }
}

// Usage
public class PrototypePattern {
    public static void main(String[] args) {
        Vehicle carPrototype = new Car();
        Vehicle bikePrototype = new Motorbike();
        
        Vehicle clonedCar = carPrototype.cloneVehicle();
        Vehicle clonedBike = bikePrototype.cloneVehicle();
        
        System.out.println("Cloned Vehicle 1: " + clonedCar);  // Cloned Vehicle 1: Car
        System.out.println("Cloned Vehicle 2: " + clonedBike); // Cloned Vehicle 2: Motorbike
    }
}
