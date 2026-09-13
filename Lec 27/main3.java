

public class main3 {
    public static void main(String[] args) {
        Pair<Integer, String> p = new Pair<>(10, "Rishabh");
        System.out.println(p.first + " , "+ p.second);
    }
}

class Pair<T, U>{
    T first;
    U second;

    Pair(T first, U second){
        this.first = first;
        this.second = second;
    }
}
