// JAVA I/O is a stream based;
/*
    1. InputStream -> used for read();
    2. OutputStream -> used for write();
*/
import java.io.*;

public class main {
    public static void main(String[] args) throws IOException {
        // int x = System.in.read(); // only take int values, this read() take only 1 byte

        // System.out.println((char)x);
        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader bfr = new BufferedReader(isr);
        String name = bfr.readLine();
        System.out.println(name);
    }
}
