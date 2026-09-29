import java.util.*;

public class main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        // System.out.println(list.get(2));
        // list.set(1, 5);
        // System.out.println(list);
        // list.addAll(0, List.of(9,8,7));
        // System.out.println(list);
        
        ListIterator<Integer> it = list.listIterator(3);

        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}
