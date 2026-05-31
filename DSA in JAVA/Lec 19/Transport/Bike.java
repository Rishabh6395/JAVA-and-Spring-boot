package Transport;

public class Bike extends Vehicle {
    public String handleBarStyle;
    public String suspensionType;

    public Bike(String name, String model, int noOfTyres, String handleBarStyle, String suspensionType){
        super(name, model, noOfTyres);
        this.handleBarStyle = handleBarStyle;
        this.suspensionType = suspensionType;
    }
    public void wheele(){
        System.out.println("Bike is doing Wheelineegg: "+ name);
    }
}
