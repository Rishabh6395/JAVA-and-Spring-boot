// Javav Collection Interface

import java.util.ArrayList;
import java.util.Collection;

public class main {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);

        // Size()
        int n = c.size();
        // System.out.println(n);

        // System.out.println(c.isEmpty());

        // System.out.println(c.contains(2));

        // iterate() --> Iterator

        // Object toArray()
        Object[] obj = c.toArray();
        for(Object o: obj){
            System.out.println(o);
        }

    }
}
