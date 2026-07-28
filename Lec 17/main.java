

public class main {
    public static void main(String[] args) {
        Car c1 = new FuelCar();
        c1.start();
        c1.accelerate();
        c1.brake();
    }
}

abstract class Car {
    void start(){
        System.out.println("Car started");
    }

    abstract void accelerate();

    abstract void brake();
}

class FuelCar extends Car {
    @Override
    void brake(){
        System.out.println("Fuel car is stopping");
    }

    @Override
    void accelerate(){
        System.out.println("Fuel car is accelerating");
    }
}

class ElectricCar extends Car {
    @Override
    void brake(){
        System.out.println("Electic car is stopping");
    }

    @Override
    void accelerate(){
        System.out.println("Electic car is accelerating");
    }
}

