// Java nested classes

/* KEYS PROPERTIES OF NESTED CLASS

    1. Does not need an instance of Outer Class.
    2. Class can be instantiated like a normal class.
    3. can access only static members of outer class.
    4. Can acess non static memebers by having a reference of Outer class.
    5. It is just like normal class & can do anything an Outer class does. 
*/


public class main {
    public static void main(String[] args) {
        Outer.Inner in = new Outer.Inner();
        Outer ot = new Outer();
        in.fun(ot);
    }
}

class Outer{

    static int x = 4;
    int y=69;

    static class Inner{
        void fun(Outer outer){
            System.out.println("Hii");
            System.out.println(outer.y);
        }
    }
}
