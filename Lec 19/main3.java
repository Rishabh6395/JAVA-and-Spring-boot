

public class main3 {
    public static void main(String[] args) {

        Outer out = new Outer();
        out.greet();        
    }
}

class Outer{
    void greet(){
        int y =4;

        class Local{
            void sayHello(){
                System.out.println("Hello");
                System.out.println(y);
            }
        }
        Local local = new Local();
        local.sayHello();
    }
}