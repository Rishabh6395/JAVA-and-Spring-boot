// Interface in Depth
// Interfaces defines what an object can do without telling how it does that.

public class main {
    public static void main(String[] args) {
        Car c = new BlackThar();
        c.drive();
    }
}

interface Car {
    void drive();
}

abstract class Thar implements Car {
    abstract public void drive();
}

class BlackThar extends Thar{
    @Override
    public void drive(){
        System.out.println("Black thar is woking");
    }
}
