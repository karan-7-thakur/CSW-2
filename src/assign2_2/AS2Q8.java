package assign2_2;

import java.util.HashMap;
import java.util.Map;

public class AS2Q8 {
    static Map<String, Integer> frequency(String str) {
        Map<String, Integer> freq = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (freq.containsKey(str.charAt(i))) {
                freq.put(String.valueOf(str.charAt(i)), freq.get(str.charAt(i)) + 1);
            } else {
                freq.put(String.valueOf(str.charAt(i)), 1);
            }

        }

        return freq;

    }

    static boolean checkAnagram(String str1, String str2) {
        Map<String, Integer> freq1 = frequency(str1);
        Map<String, Integer> freq2 = frequency(str2);
        return freq1.equals(freq2);

    }

    public static void main(String[] args) {
        String ana1 = "sadder";
        String ana2 = "dreads";

        System.out.println(checkAnagram(ana1, ana2));

    }

}
