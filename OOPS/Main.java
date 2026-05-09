package OOPS;

public class Main {
    public static void main(String[] args) {
        
        // creating Object with "new" Keyword. 
        // Dog d1 = new Dog();
        // d1.name = "Tommy";
        // d1.bark();
        // d1.walk();

        // Dog d2 = new Dog();
        // d2.name = "leo";
        // d2.walk();

        Complex num1 = new Complex();
        num1.a = 3;
        num1.b = 5;
        num1.print();
    }
}


class Complex{
    int a, b;

    void print(){
        System.out.println(a+ " + " + b + "i");
    }
}


// class is blueprint just like factory
class Dog{
    // properites
    String name;
    int age;
    String color;

    // behaviour
    void walk(){
        System.out.println(name + " Dog is walking");
    }

    void bark(){
        System.out.println(name + " Dog is barking");
    }
}

class Cat{

}
