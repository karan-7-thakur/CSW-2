package assign2_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AS2Q10 {

    static ArrayList<Integer> sortByKey(Map<Integer, Integer> map) {
        ArrayList<Integer> sortedKeys = new ArrayList<>(map.keySet());
        Collections.sort(sortedKeys);

        return sortedKeys;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 8, 10 };
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i < 11; i++) {
            map.put(i, 0);
        }

        System.out.println(map);

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.get(arr[i]) + 1);
        }

        System.out.println(map);

        ArrayList<Integer> sortedKeys = sortByKey(map);
        for (Integer ele : sortedKeys) {
            if (map.get(ele) == 0) {
                System.out.println("Smallest missing number: " + ele);
                break;
            }

        }

    }

}
