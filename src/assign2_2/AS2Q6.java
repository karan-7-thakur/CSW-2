package assign2_2;

import java.util.Set;
import java.util.TreeSet;

public class AS2Q6 {
    public static void main(String[] args) {
        System.out.println("TESTING");

        Set<Integer> st = new TreeSet<>();
        st.add(5);
        st.add(10);
        System.out.println(st);

        System.out.println(st.contains(10));

        st.remove(5);
        System.out.println(st);

    }
}