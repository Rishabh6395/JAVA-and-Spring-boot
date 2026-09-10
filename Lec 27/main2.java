

public class main2 {
    public static void main(String[] args) {
        // Box b1 = new Box(10);
        // Box b2 = new Box("Rishabh");
        // System.out.println(b1.getValue());
        // System.out.println(b2.getValue());

        // Downcasting
        Box b1 = new Box(10);
        Box b2 = new Box("Hello");
        Box b3 = new Box(true);

        Integer x = (Integer)b1.getValue();
        String y = (String)b2.getValue();
        Boolean z = (Boolean)b3.getValue();

        System.out.println(x+5);
        System.out.println(y+5);
        System.out.println(z);
        
    }
}


class Box{
    private Object value;

    Box(Object value){
        this.value = value;
    }

    public  Object getValue(){
        return  this.value;
    }

    public  void setValue(Object value){
        this.value = value;
    }
}

