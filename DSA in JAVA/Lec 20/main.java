// Polymorphism in JAVA

// method overloading:
class Calculate{
    int add( int a, int b){
            return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }
}


public class main {

    public static void main(String[] args) {
        // Calculate c = new Calculate();
        // System.out.println(c.add(1,2));

        Circle c = new Circle();
        c.draw();
    }
}
