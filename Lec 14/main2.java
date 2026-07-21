// call by value (but we mimicing the call by reference, there is no call by reference in java):


public class main2 {
    public static void main(String[] args) {
        Random r1 = new Random(4, 5);

        System.out.println(r1.x + " , " + r1.y);

        addTen(r1);

        System.out.println(r1.x + " , " + r1.y);
        System.out.println("r1:"+r1);
    }
    
    static void addTen(Random r){
        r.x = r.x + 10;
        r.y = r.y + 10;
        System.out.println("r:"+r);
    }

    static class Random {
        int x;
        int y;

        Random(int x, int y){
            this.x = x;
            this.y = y;
            System.out.println("lolthis: " +this);
            System.out.println("lolthis+ x: " +this.x);
        }
    }
}
