package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setImplementation {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        // System.out.println(set);

        set.remove(4);
        set.remove(5);
        System.out.println(set);

        Set<Integer> set2 = new HashSet<>();
        set2.addAll(set);
        set2.add(10);
        set2.add(20);

        // System.out.println(set2);
        set2.removeAll(set);
        set2.add(5);
        set2.add(6);
        System.out.println(set2);

        set.removeAll(set2); // set Difference
        set.retainAll(set2); // intersection
        System.out.println(set);

        // Set<Integer> set = new LinkedHashSet<>(); -> maintains insertion ordering
        // Set<Integer> set = new TreeSet<>(); -> maintains sorted order

        // Traversing - Iterator
        System.out.println(set);
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}