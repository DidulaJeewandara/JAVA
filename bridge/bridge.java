
interface Engine {
    void startEngine();
}


// Concrete Implementations
class PetrolEngine implements Engine {

    @Override
    public void startEngine() {
        System.out.println("Petrol Engine Started");
    }
}

class ElectricEngine implements Engine {

    @Override
    public void startEngine() {
        System.out.println("Electric Engine Started");
    }
}


// Abstraction
abstract class Vehicle {

    protected Engine engine;

    Vehicle(Engine engine) {
        this.engine = engine;
    }

    abstract void drive();
}


// Refined Abstractions
class Car extends Vehicle {

    Car(Engine engine) {
        super(engine);
    }

    @Override
    void drive() {
        System.out.print("Car uses ");
        engine.startEngine();
    }
}

class Bike extends Vehicle {

    Bike(Engine engine) {
        super(engine);
    }

    @Override
    void drive() {
        System.out.print("Bike uses ");
        engine.startEngine();
    }
}


// Main Class
public class bridge {

    public static void main(String[] args) {

        Vehicle car = new Car(new PetrolEngine());

        Vehicle bike = new Bike(new ElectricEngine());

        car.drive();

        bike.drive();
    }
}