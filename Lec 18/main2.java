public class main2 {
    public static void main(String[] args) {
        // Integer x = 600;
        // Integer y = 600;

        // System.out.println(x==y); // false

        Dog d = new Dog("kallu");
        d.sleep();
    }
}


abstract class Animal {

    String name;
    Animal(String name){
        this.name = name;
        System.out.println(name);
    }

    abstract void makeSound();

    final void sleep(){
        System.out.println("Sleeping");
    }
}

class Dog extends Animal {

    Dog(String name){
        super(name);
    }
    
    @Override
    void makeSound(){
        System.out.println("dog barking");
    }

    

}