// JAVA I/O is a stream based;
/*
    1. InputStream -> used for read();
    2. OutputStream -> used for write();
*/
import java.io.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        // int x = System.in.read(); // only take int values, this read() take only 1 byte

        // System.out.println((char)x);
        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader bfr = new BufferedReader(isr);
        // String name = bfr.readLine();
        // System.out.println(name);

        Scanner sc = new Scanner(System.in);
        String Newname = sc.nextLine();
        int age = sc.nextInt();

        System.out.println(Newname);
        System.out.println(age);

    }
}
