// Java Generics:

public class main {
    public static void main(String[] args) {
        // UpCasting
        String s = "Hello";
        Object obj = s;

        // Downcasting
        Object obj2 = "Rishabh";
        String s2 = (String)obj2;
        System.out.println(s2);

        Object obj3 = 10;
        String s3 = (String)obj3;

        System.out.println(s3); // ClassCastException
    }
}
