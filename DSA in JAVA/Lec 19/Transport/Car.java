package Transport;

/*
    Defination of Super Keyword:

    1. Refer to the instance if immediate parent.
    2. Invokes constructor of immediate parent.
    3. Invokes a method of immediate parent.
*/

public class Car extends Vehicle {
    public int noOfDoors;
    public String transmissionType;

    public Car(String name, String model,int noOfDoors, int noOfTyres, String transmissionType){
        super(name, model, noOfTyres);
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
    }

    public void startAC(){
        System.out.println("AC started of: " + name);
    }
}
