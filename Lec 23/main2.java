

public class main2 {
    public static void main(String[] args) {
        PaymentStatus status = PaymentStatus.SUCCESS;
        // System.out.println(status);

        Direction d = Direction.SOUTH;

        System.out.println(d.getDegree());

    }    
}

// Enum -> Enumerations (Enuerated Type)
// Enum -> Predefined set of constants.

enum PaymentStatus {
    SUCCESS,
    FAILED,
    PENDING
}


enum Direction {
    NORTH(0),
    SOUTH(180),
    EAST(90),
    WEST(270);

    private int degree;

    Direction(int degree){
        this.degree = degree;
    }
    public int getDegree(){
        return this.degree;
    }
}