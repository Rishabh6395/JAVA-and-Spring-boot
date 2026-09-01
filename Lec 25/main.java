public class main {
    public static void main(String[] args) {

        // Literals:
        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println(s1 == s2); // true; (Compare reference and s2 points the same as s1)

        String s3 = new String("Rishabh");
        String s4 = new String("Rishabh");
        // System.out.println(s3 == s4); // false (Compares Values and new keyword always create a new Object in Heap)
        System.out.println(s3.equals(s4)); // true;
        
    }
}
