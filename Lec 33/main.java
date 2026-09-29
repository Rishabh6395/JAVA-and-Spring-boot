import java.util.*;

public class main {
    public static void main(String[] args) {
        // Set
        Set<String> set = new HashSet<>();
        set.add("Rishabh");
        set.add("Rohit");
        set.add("Rohan");
        // System.out.println(set.contains("Aman"));

        // Map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Rishabh");
        map.put(2, "Aman");
        map.put(3, "Rhoan");
        System.out.println(map.containsKey(2));
        System.out.println(map.containsKey(4));

    }
}
