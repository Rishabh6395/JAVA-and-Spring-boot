// Inner Class

public class main2 {
    public static void main(String[] args) {
        // Outer.Inner in = new Outer.Inner();

        Outer outer = new Outer();

        Outer.Inner inner = outer.new Inner();
        inner.fun();
        inner.fun2();
        Outer.Inner.fun2();
    }
}


class Outer {
    int x = 10;
    class Inner{

        int x = 20;
        void fun(){
            System.out.println(x);
            System.out.println(Outer.this.x);
        }

        static void fun2(){
            System.out.println("Hello");
        }
    }
}
