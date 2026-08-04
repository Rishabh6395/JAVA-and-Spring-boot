// Inner Class

public class main2 {
    public static void main(String[] args) {
        // Outer.Inner in = new Outer.Inner();

        Outer outer = new Outer();

        Outer.Inner inner = outer.new Inner();
        inner.fun();
    }
}


class Outer {

    class Inner{
        void fun(){
            System.out.println("Hiiii");
        }
    }
}
