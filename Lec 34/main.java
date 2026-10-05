import java.util.*;

public class main {
    public static void main(String[] args) {

        // Constructor of HashSet / LinkedHashSet

        // Set<Integer> set = new HashSet<>();

        // // Initial capacity
        // Set<Integer> set2 = new HashSet<>(100);
        // // capacity, load factor
        // Set<Integer> set3 = new HashSet<>(100, 0.8f);
        // // using another collections
        // Set<Integer> set4 = new HashSet<>(List.of(1, 2, 3, 4, 5, 5, 6, 7, 8, 9));

        TreeSet<Integer> set = new TreeSet<>();

        set.add(80);
        set.add(25);
        set.add(90);
        set.add(10);
        set.add(60);

        // System.out.println(set.first());
        // System.out.println(set.last());

        // System.out.println(set.headSet(80));
        // System.out.println(set.tailSet(80)); // fromElement is inclusive

        // System.out.println(set.subSet(25, 60)); // fromElement is inclusive and toElem is inclusive

        // Navigable Set;
        // System.out.println(set.lower(80)); // largest num but smaller then 80

        System.out.println(set.floor(80)); // greatest elem less then or equal to 80
    }
}
