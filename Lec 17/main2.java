// Interface

public class main2 {
    public static void main(String[] args) {
        Car c1 = new ElectricCar();
        c1.start();
        c1.accelerate();
        c1.brake();
    }
}


interface Car {
    void start();

    void accelerate();

    void brake();
}



class FuelCar implements Car {

    @Override
    public void start(){
        System.out.println("Fuel car has started");
    }

    @Override
    public void brake(){
        System.out.println("Fuel car is stopping");
    }

    @Override
    public void accelerate(){
        System.out.println("Fuel car is accelerating");
    }
}

class ElectricCar implements Car {
    
    @Override
    public void start(){
        System.out.println("Electric car has started");
    }

    @Override
    public void brake(){
        System.out.println("Electic car is stopping");
    }

    @Override
    public void accelerate(){
        System.out.println("Electic car is accelerating");
    }
}
