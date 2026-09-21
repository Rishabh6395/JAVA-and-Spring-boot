import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.List;

// Generics with Lower bound (super)

public class main3 {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());
        fun(animals);
    }

    public static void fun(List <? super Animal> values){
        values.add(new Animal());
        values.add(new Dog());

        for(Object obj: values){
            Animal a = (Animal)obj;
            a.eat();
        }
    }
}



class Animal {
    void eat(){
        System.out.println("Animal Eating");
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
