

public class main {
    public static void main(String[] args) {
        String s1 = new String("");
        String s2 = new String("Hello");

        String s3 = "Rishabh";
        String s4 = new String(s3);

        // System.out.println(s2);


        // StringBuilder / StringBuffer
        StringBuilder  sb = new StringBuilder("Hello");
        StringBuffer sbf = new StringBuffer(sb);
        System.out.println(sbf);

    }
}
