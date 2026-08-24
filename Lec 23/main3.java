

public class main3 {
    public static void main(String[] args) {

        Direction[] dd = Direction.values();
        for(Direction di : dd){
            System.out.println(di.name());
        }

        // Directions d = Directions.valueOf("EAST");
        // System.out.println(d);
    }
}

// values() --> We can iterate in this enum
// valueOf() --> onver a String into an enum constant
// name() vs toString() --> toString can be overriden but name() we cannot
// ordinal()

enum Direction{
    NORTH,
    SOUTH,
    EAST,
    WEST
}