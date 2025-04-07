package Extras.src;

import java.util.HashMap;
import java.util.Map;

public class Freq {

    static Map<Integer, Integer> getFreq(int[] arr) {

        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            // if (freqMap.containsKey(arr[i])) {
            // freqMap.put(arr[i], freqMap.get(arr[i])+1);

            // }else{
            // freqMap.put(arr[i], 1);
            // }

            // ----------------------------------------------
            // putIfAbsent : puts a value if key is absent
            // freqMap.putIfAbsent(arr[i],0);
            // freqMap.put(arr[i], freqMap.get(arr[i])+1);

            // ----------------------------------------------
            // getOrDefault : gets the value if present or puts a default value
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);

        }

        // System.out.println(freqMap);
        return freqMap;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 8, 1, 9, 8, 2 };

        // System.out.println(getFreq(arr));

        Map<Integer, Integer> hash = getFreq(arr);

        System.out.println("Keys | Values");
        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }
    }
}
