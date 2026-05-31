package Transport;

public class Vehicle {
    
    public String name;
    
    public String model;

    public int noOfTyres;

    // constructor:
    public Vehicle(String name, String model, int noOfTyres){
        this.model = model;
        this.name = name;
        this.noOfTyres = noOfTyres;
    }
    
    // This is default constructor: (koi use ni hai bass error ari this Car.java mai isliye bnaya)
    Vehicle(){
        this.model = "";
        this.name = "";
        this.noOfTyres = -1;
    }

    public void StartEngine(){
        System.out.println("Engine is starting "+ name + " " + model);
    }

    public void StopEngine(){
        System.out.println("Engine is stopping " + name + " " + model);
    }

}
