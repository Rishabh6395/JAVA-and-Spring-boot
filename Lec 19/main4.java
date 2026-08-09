// anonymous Classes: A class without a name;
// use case: When you need to perform a task only 1 time then you make a anonymous class.

public class main4 {
    public static void main(String[] args) {
        Person p1 = new Person(){
            @Override
            void introduce(){
                System.out.println("Hi am a guest");
            }
        };
        p1.introduce();
    }

}

class Person {
    void introduce(){
        System.out.println("hi, i am new person");
    }
}

/*
    Most used classes

    1. Static Nested class
    2. Inner Class
    3. Anonymous Class --> Lambdas
    4. Local Class (Least used class)
*/
