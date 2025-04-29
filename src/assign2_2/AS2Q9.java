package assign2_2;

import java.util.HashSet;
import java.util.Set;

public class AS2Q9 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 4, 5, 1, 2, 3, 5 };
        Set<Integer> set = new HashSet<>();

        for (int elem : arr) {
            if (set.contains(elem)) {
                // Duplicates
                System.out.print(elem + " ");
            } else {
                set.add(elem);
            }

        }
    }
}
