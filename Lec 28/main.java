import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        // Invarient in generics:
        // Animal a = new Animal();
        // a.eat();
        // a.walk();

        // List<Dog> dogs = new ArrayList<>();
        // List<Animal> animals = dogs; // NOT ALLOWED

        Dog[] dogs = new Dog[10];
        Animal[] animals = dogs;

        
    }
}

class Animal {
    void eat(){
        System.out.println("Eating");
    }
    void walk(){
        System.out.println("Walking");
    }
}

class Dog extends Animal {
    void bark(){
        System.out.println("Barking");
    }
}
