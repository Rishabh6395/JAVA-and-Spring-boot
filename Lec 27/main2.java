

public class main2 {
    public static void main(String[] args) {
        // Box b1 = new Box(10);
        // Box b2 = new Box("Rishabh");
        // System.out.println(b1.getValue());
        // System.out.println(b2.getValue());

        // Downcasting
        // Box b1 = new Box(10);
        // Box b2 = new Box("Hello");
        // Box b3 = new Box(true);

        // Integer x = (Integer)b1.getValue();
        // String y = (String)b2.getValue();
        // Boolean z = (Boolean)b3.getValue();

        // System.out.println(x+5);
        // System.out.println(y+5);
        // System.out.println(z);


        Box<Integer> b1 = new Box<Integer>(10);
        Box<String> b2 = new Box<>("Rishabh");
        Box<Boolean> b3 = new Box<>(true);
        System.out.println(b1.getValue());
        System.out.println(b2.getValue());
        System.out.println(b3.getValue());

    }
}

// Generics

class Box<T> { // Type Parameter
    private T value;

    Box(T value){
        this.value = value;
    }

    public  T getValue(){
        return  this.value;
    }

    public  void setValue(T value){
        this.value = value;
    }
}

