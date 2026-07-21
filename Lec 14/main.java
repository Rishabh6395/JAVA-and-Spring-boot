// call by value
// NOTE: there is no Call by reference in JAVA. But in C, C++ we have

public class main {
    public static void main(String[] args) {
        int x = 4;
        int y = 5;

        System.out.println(x + " , " + y);

        addTen(x,y);

        System.out.println(x + " , " + y);
    }

    static void addTen(int x, int y){
        x = x + 10;
        y = y + 10;
    }
}
