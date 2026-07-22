// final keyword:


public class main2 {
    public static void main(String[] args) {
        Random r1 = new Random();
        System.out.println(r1.pi);

        final int x;
        x = 4;
        System.out.println(x);
    }
}

class Random{
    final double pi = 3.14;
}
