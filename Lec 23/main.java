
public class main {
    public static void main(String[] args) {
        int status = PaymentStatus.SUCCESS;
        System.out.println(status);
    }
}

class PaymentStatus {
    public static int SUCCESS = 1;
    public static int FAILED = 2;
    public static int PENDING = 3;
}