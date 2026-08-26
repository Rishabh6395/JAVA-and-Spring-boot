

public class main2 {
    public static void main(String[] args) {
        Random r1 = new Random();
        r1.fun();
    }
}

// Variables inside interface

interface MathConstant {
    double PI_VALUE = 3.14;
    int VALUE = 10;
}

class Random implements MathConstant{
    void fun(){
        System.out.println(PI_VALUE);
    }
}
